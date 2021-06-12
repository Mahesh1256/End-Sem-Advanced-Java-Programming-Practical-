
//CREATED BY
//Piyush Bisht
//Section:C
//RollNo: 1018542 / 45

import java.io.*;
import java.net.*;

public class client{
    public static void main(String[] args) {
        
        try {
            
            Socket s=new Socket("localhost",8081);
            DataInputStream dataRead=new DataInputStream(s.getInputStream());
            DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while(!str.equals("bye"))
            {
                str=br.readLine();
                dataWrite.writeUTF(str);
                dataWrite.flush();
                str2=dataRead.readUTF();
                System.out.println("Server Says: "+str2);
            }
            dataRead.close();
            s.close();
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
    }

}

