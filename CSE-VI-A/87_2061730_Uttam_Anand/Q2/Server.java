import java.net.*;
import java.io.*;

class Server {
//  Uttam Anand
	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(8000);
		Socket s = ss.accept();

		System.out.println("Connection established");

		DataInputStream rd = new DataInputStream(s.getInputStream());

		DataOutputStream wd = new DataOutputStream(s.getOutputStream());
        //  Roll - 2061730
		BufferedReader ti = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "", s2 = "";
		while (!s1.equals("stop"))
		{
			s1 = rd.readUTF();
			System.out.println("Client->" + s1);
			s2 = ti.readLine();
			wd.writeUTF(s2);
			wd.flush();
		}

		rd.close();
		s.close();
		ss.close();

	}

}