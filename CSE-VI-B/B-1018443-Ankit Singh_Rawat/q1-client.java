import java.net.*;
import java.io.*;
public class client{
    public static void main(String[] args)throws Exception {
        Socket s=new Socket("localhost",8081);
        DataInputStream dataread=new DataInputStream(s.getInputStream());
        DataOutputStream datawrite=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str.equals("bye")){
            str=br.readLine();
            datawrite.writeUTF(str);
            datawrite.flush();;
            str2=dataread.readUTF();
            System.out.println("server says: "+str2);
        }
        dataread.close();
        s.close();
    }
}