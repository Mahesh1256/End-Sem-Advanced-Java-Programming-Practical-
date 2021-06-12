import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;

class server {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8085);
        Socket s = ss.accept();

        //s in socket formed after connection established and is accpeted

        System.out.println("***Connection Established***");
        String recieved = "",send;

        DataOutputStream Os=new DataOutputStream(s.getOutputStream());
        DataInputStream Is=new DataInputStream(s.getInputStream());

    

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(!recieved.equals("bye")){
            recieved=(String)Is.readUTF();
            System.out.println("Message from Client-"+recieved);
            send=br.readLine();
            Os.writeUTF(send);
            Os.flush();
        }
        Is.close();
        Os.close();
        s.close();
    }
}