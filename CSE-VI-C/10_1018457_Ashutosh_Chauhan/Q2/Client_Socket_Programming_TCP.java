import java.io.*;
import java.net.*;

public class Client_Socket_Programming_TCP {
    public static void main(String [] args){

        try {

            Socket s = new Socket("Localhost", 8080);

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dot = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str_client="", str_server;

            while(!str_client.equals("Bye")){

                System.out.print("You : ");
                str_client = br.readLine();
                dot.writeUTF(str_client);
                dot.flush();

                str_server = din.readUTF();
                System.out.println("Server : " + str_server);

            }

            din.close();
            dot.close();
            br.close();
            s.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}