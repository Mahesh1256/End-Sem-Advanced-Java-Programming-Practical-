import jdbc.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;

public class Q2 {
public static void main(String[] args) throws IOException{
    Connection con = null;
    Statememt stat = null;
    ResultSet res = null;

    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:8084/practicalDB","root","L@kshay123");
        // datbase practicalDb table book
        stat = con.createStatement();
        res = stat.executeQuery("select * from book");
        
        //displaying full table
        while(res.next()){
            System.out.println("Accesion No\t" + "Title\t" + "Author\t" + "Edition\t" + "Publisher\t");
            System.out.println(res.getString("AccessionNo") + res.getString("Title") + res.getString("Author") + res.getString("Edition") + res.getString("Publisher"));
        }

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String query = "select * from book where AccessionNO =" + n;
        res = stat.executeQuery(query);

        while(res.next()){
            System.out.println("Accesion No\t" + "Title\t" + "Author\t" + "Edition\t" + "Publisher\t");
            System.out.println(res.getString("AccessionNo") + res.getString("Title") + res.getString("Author") + res.getString("Edition") + res.getString("Publisher"));
        }
    }
    catch(Exception exc){
        exc.printStackTrace();
    }


}    
}
