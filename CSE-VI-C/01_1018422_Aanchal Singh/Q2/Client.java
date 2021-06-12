import java.io.*;
import java.net.*;
public class Client
{
    public static void main(String Args[])throws IOException
    {
        try{
            Socket s=new Socket("localhost",1098);
            DataInputStream dataRead=new DataInputStream(s.getInputStream());
            DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while(!str.equalsIgnoreCase("bye")){
                str=br.readLine();
                dataWrite.writeUTF(str);
                dataWrite.flush();
                str2=dataRead.readUTF();
                System.out.println("Server says: "+str2);
            }
            dataWrite.close();
            dataRead.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}