/*
Name:- Shivam
Roll NO:- 63_1018594
Section:- C
*/
import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String clientMessage = "", serverMessage = "";
        while (!clientMessage.equals("close!!")) {
            clientMessage = dataInputStream.readUTF();
            System.out.println("Client:\t" + clientMessage);
            System.out.print("You:\t");
            serverMessage = br.readLine();
            dataOutputStream.writeUTF(serverMessage);
            dataOutputStream.flush();
        }
        dataInputStream.close();
        socket.close();
        serverSocket.close();
    }
}