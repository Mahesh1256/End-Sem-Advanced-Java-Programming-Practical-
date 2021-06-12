import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",8080);
        DataOutputStream dataWrite = new DataOutputStream(socket.getOutputStream());
        DataInputStream dataRead = new DataInputStream(socket.getInputStream());
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String str1= "",str2="";
        while(!str1.equals("stay safe")){
        str1=reader.readLine();
        dataWrite.writeUTF(str1);
        dataWrite.flush(); 
        str2=dataRead.readUTF();
        System.out.println("Server says : "+str2);
        }
        dataRead.close();
        dataWrite.close();
        socket.close();
    }
}
