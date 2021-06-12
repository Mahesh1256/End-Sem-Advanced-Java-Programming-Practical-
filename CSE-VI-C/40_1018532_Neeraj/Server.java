import java.net.*;
import java.io.*;
public class Server {
    public static void main(String args[])throws Exception{
        ServerSocket serverSocket =new ServerSocket(8080);
        Socket socket=serverSocket.accept();
        System.out.println("Online");
        DataInputStream dataRead=new DataInputStream(socket.getInputStream());
        DataOutputStream dataWrite=new DataOutputStream(socket.getOutputStream());
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
        while(!str1.equals("stay safe")){
            str1=dataRead.readUTF();
            System.out.println("Client :"+str1);
            str2=reader.readLine();
            dataWrite.writeUTF(str2);
            dataWrite.flush();
        }
        dataRead.close();
        dataWrite.close();
        serverSocket.close();
        socket.close();
    }
}
