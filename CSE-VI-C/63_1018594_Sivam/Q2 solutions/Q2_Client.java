/*
Name:- Shivam
Roll NO:- 63_1018594
Section:- C
*/
import java.net.*;
import java.io.*;

class Client {
    /*
     * This is SocClient file where I had put my code for client
     */
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8080);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String clientMessage = "", serverMessage = "";
        while (!clientMessage.equals("close!!")) {
            System.out.print("You:\t");
            clientMessage = br.readLine();
            dataOutputStream.writeUTF(clientMessage);
            dataOutputStream.flush();
            serverMessage = dataInputStream.readUTF();
            System.out.println("Server:\t" + serverMessage);
        }

        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
    }
}