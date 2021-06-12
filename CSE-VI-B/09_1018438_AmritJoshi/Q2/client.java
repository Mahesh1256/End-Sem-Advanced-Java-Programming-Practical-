import java.io.*;
import java.net.*;

public class client{
    public static void main(String args[]) {
        try{
            Socket s=new Socket("localhost",1234);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            DataInputStream dis =new DataInputStream(s.getInputStream());

            String str="",str1="";

            while(!str.equalsIgnoreCase("bye")){
                str=br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str1=dis.readUTF();
                System.out.println("server="+str1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}