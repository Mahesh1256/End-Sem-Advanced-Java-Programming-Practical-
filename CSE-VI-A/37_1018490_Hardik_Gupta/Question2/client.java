import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

class client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s=new Socket("localhost", 8085);

        //localhost is domain for local system server
        //port number is 8085
        //IS and OS are data Input and Output streams

        DataInputStream Is= new DataInputStream(s.getInputStream());
        DataOutputStream Os= new DataOutputStream(s.getOutputStream());
        String send="",recieve;

    

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(!send.equals("bye")){
            send=br.readLine();
            Os.writeUTF(send);
            Os.flush();
            recieve=(String) Is.readUTF();
            System.out.println("Message From Server :"+recieve);
        }
        Is.close();
        Os.close();
        s.close();
    }
}