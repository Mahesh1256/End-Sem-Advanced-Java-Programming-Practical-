import java.io.*;
import java.net.*;

public class Server_Socket_Programming_TCP {
    public static void main(String [] args){

        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();

            DataOutputStream dot = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str_client="", str_server;

            while(!str_client.equals("Bye")){

                str_client = din.readUTF();
                System.out.println("Client : " + str_client);

                System.out.print("You : ");
                str_server = br.readLine();
                dot.writeUTF(str_server);
                dot.flush();

            }

            dot.close();
            din.close();
            br.close();
            s.close();
            ss.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}