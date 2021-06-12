import java.net.*;
import java.io.*;
class Client
{
public static void main (String args[]) throws Exception
{
try // using try block 
{
Socket sk = new Socket("192.168.43.77",1900);
PrintWriter pw = new PrintWriter(sk.getOutputStream(),true);
pw.println("Client : Hello");
pw.println("Client : My university RollNo is 1018685 ");
pw.println("Client : My Name is Neetika Vyas");

// client is Reading from is InputStream 

InputStreamReader isr = new InputStreamReader(sk.getInputStream());
BufferedReader br=new BufferedReader(isr);
String s1=br.readLine();
System.out.println("Message is"+ s1);
pw.close();
sk.close();
}
catch(Exception e)
{}
}
}