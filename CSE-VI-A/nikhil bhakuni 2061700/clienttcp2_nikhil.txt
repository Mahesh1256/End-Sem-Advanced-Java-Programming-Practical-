import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client_TCP2 {

	public static void main(String[] args) {
		try {
			Scanner reader = new Scanner(System.in);
			Socket sc = new Socket("localhost",8080);
			DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
			DataInputStream dis = new DataInputStream(sc.getInputStream());
			String str = "";
			do {
				str = reader.nextLine();
				dos.writeUTF(str);
				dos.flush();
				System.out.println(dis.readUTF().toString());
			}while(!str.equals("Stop"));
			dos.close();
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
