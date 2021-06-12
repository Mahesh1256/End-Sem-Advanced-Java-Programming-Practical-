import java.io.*;
import java.net.*;
public class Client {

	public static void main(String[] args) {
		try
		{
			Socket s=new Socket("localhost",8085);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(s.getInputStream());
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String str="",str1="";
			while(!(str.equals("Stay Safe")))
			{       str=br.readLine();
				dout.writeUTF(str);
				dout.flush();
				str1=din.readUTF();
				System.out.println("Server Says:"+str1);
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
