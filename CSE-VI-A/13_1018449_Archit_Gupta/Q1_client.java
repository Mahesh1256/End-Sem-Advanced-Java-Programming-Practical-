import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

class Q2_client {
    public static void main(String[] args) throws UnknownHostException, IOException {
	//Archit Gupta 1018449
        Socket s=new Socket("localhost", 8085);

        //localhost is domain for local system server
        //port number is 8080
        //IS and OS are data streams

        DataInputStream Is= new DataInputStream(s.getInputStream());
        DataOutputStream Os= new DataOutputStream(s.getOutputStream());
        String send="",recieve;

        //recieve is message recieved by client
        //send is message to be sent by client
	//Archit Gupta 1018449
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
	//end of file Archit Gupta 1018449
    }
}