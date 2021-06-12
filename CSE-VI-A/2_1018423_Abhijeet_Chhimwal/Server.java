//AJP End Sem
//This is a Server program
import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8081);          //serversocket object
        Socket s = ss.accept();
        System.out.println("Connection established...");
        DataInputStream dread = new DataInputStream(s.getInputStream());           //InputStream
        DataOutputStream dwrite = new DataOutputStream(s.getOutputStream());       //OutputStream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //gets user string

        String str1="",str2="";
        while(!str1.equals("bye")){
            str1 = dread.readUTF();
            System.out.println("Client says: "+str1);           //display what client said
            str2 = br.readLine();
            dwrite.writeUTF(str2);
            dwrite.flush();
        }
        dread.close();
        s.close();
        ss.close();
    }
}
//Created by Abhijeet Chhimwal - 1018423 - Sec A