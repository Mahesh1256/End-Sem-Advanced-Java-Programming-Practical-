import java.net.*;
import java.io.*;
public class server{
    public static void main(String[] args)throws Exception {
        ServerSocket ss=new ServerSocket(8081);
        Socket s=ss.accept();
        System.out.println("connection is stable now!");
        DataInputStream dataread=new DataInputStream(s.getInputStream());
        DataOutputStream datawrite=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str.equals("bye")){
            str=dataread.readUTF();
            System.out.println("client says "+str);
            str2=br.readLine();
            datawrite.writeUTF(str2);
            datawrite.flush();
        }
        dataread.close();
        s.close();
        ss.close();
    }
}