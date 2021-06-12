//AJP End Sem
//This is a Client program
import java.io.*;
import java.net.*;
public class Client{
    public static void main(String args[]) throws Exception{
        Socket s = new Socket("localhost",8081);       //socket object
        DataInputStream dread = new DataInputStream(s.getInputStream());                //InputStream
        DataOutputStream dwrite = new DataOutputStream(s.getOutputStream());            //OutputStream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       //gets user string

        String str1="",str2="";
        while(!str1.equals("bye")){
            str1=br.readLine();
            dwrite.writeUTF(str1);
            dwrite.flush();
            str2=dread.readUTF();
            System.out.println("Server says: "+str2);              //display what server said
        }

        dread.close();
        s.close();
    }
}
//Created by Abhijeet Chhimwal - 1018423 - Sec A