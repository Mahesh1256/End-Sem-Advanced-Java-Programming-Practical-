import java.io.*;
import java.net.*;
public class Server
{
    public static void main(String Args[])throws IOException
    {
        try{
            ServerSocket ss=new ServerSocket(1098);
            Socket s=ss.accept(); //Establishes Connection
            System.out.println("Connection is stable now!\n\n");
            DataInputStream dataRead=new DataInputStream(s.getInputStream());
            DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while(!str.equalsIgnoreCase("bye")){
                str=(String)dataRead.readUTF();
                System.out.println("Client says:"+str);
                str2=br.readLine();
                dataWrite.writeUTF(str2);
                dataWrite.flush();
            }
            dataRead.close();
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}