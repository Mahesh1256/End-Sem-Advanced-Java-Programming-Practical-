
//CREATED BY
//Piyush Bisht
//Section:C
//RollNo: 1018542 / 45

import java.net.*;
import java.io.*;
public class server {
    
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(8081);
            Socket s=ss.accept();
            DataInputStream dataRead=new DataInputStream(s.getInputStream());
            DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            while(!str.equals("bye"))
            {
                str=dataRead.readUTF();
                System.out.println("Client Says: "+str);
                str2=br.readLine();
                dataWrite.writeUTF(str2);
                dataWrite.flush();
            }
            dataWrite.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
