import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		
		try {
			ServerSocket ss=new ServerSocket(8085);
			Socket s=ss.accept();
			System.out.println("Connection Established");
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(s.getInputStream());
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String str="",str1="";
			while(!(str1.equals("Stay safe")))
			{       str=din.readUTF();
				System.out.println("Client says:"+str);
			      str1=br.readLine();
				dout.writeUTF(str1);
				dout.flush();
			}
			dout.close();
			s.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
