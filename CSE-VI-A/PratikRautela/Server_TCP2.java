import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server_TCP2 {

	public static void main(String[] args) {
		try{
			Scanner reader = new Scanner(System.in);
			ServerSocket ss = new ServerSocket(8080);
			Socket sc = ss.accept();
			DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
			DataInputStream dis = new DataInputStream(sc.getInputStream());
			String str = "";
			do {
				System.out.println("client says: "+dis.readUTF().toString());
				str = reader.nextLine();
				dos.writeUTF(str);
				dos.flush();
			}while(!str.equals("Stop"));
			dos.close();
			ss.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
