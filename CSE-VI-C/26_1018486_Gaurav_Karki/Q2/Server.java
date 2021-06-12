import java.io.*;
import java.net.*;
public class Server{
	public static void main(String[] args) {
		try{
			ServerSocket ss=new ServerSocket(8080);
			Socket s=ss.accept();

			System.out.println("Connection Established");
			DataInputStream din=new DataInputStream(s.getInputStream());

			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			String str=" ",str1=" ";
			while(!str.equals("bye")){
				str1=(String)din.readUTF();
				System.out.println("Client Says :"+str1);
				str=br.readLine();
				dout.writeUTF(str);
				dout.flush();
			
			}
			dout.close();
			din.close();
			s.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}