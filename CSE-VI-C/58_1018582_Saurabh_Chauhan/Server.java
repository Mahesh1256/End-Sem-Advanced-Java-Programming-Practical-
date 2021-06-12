//Saurabh Chauhan
//Sec-C
//Roll No-58
//Server class
import java.io.*;  
import java.net.*;  
public class Server {  
public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(1010);//localhost
        Socket s=ss.accept();
        DataInputStream dR=new DataInputStream(s.getInputStream());
        DataOutputStream dW=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
        while(!str.equals("bye")){
            str=dR.readUTF();
            System.out.println("client says: "+str); //client says
            str2=br.readLine();//reading
            dW.writeUTF(str2);
            dW.flush();
        }
        dR.close();
        s.close();//close
        ss.close();
    }
} 