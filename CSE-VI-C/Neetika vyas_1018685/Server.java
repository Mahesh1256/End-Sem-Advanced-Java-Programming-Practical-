import java.net.*;
import java.io.*;
class Server // class name // neetika vyas
{
public static void main (String args[])throws Exception
{
try // create try block
{
ServerSocket ss= new ServerSocket(1900);
System.out.println("Hi welcome, ");
Socket sk = ss.accept();
System.out.println("Welcome my name is neetika university roll no is 1018685");
InputStreamReader isr = new InputStreamReader(sk.getInputStream());
BufferedReader br= new BufferedReader(isr);
String s=br.readLine();
System.out.println("Message is"+ s);

// Server is responding through is OutputStream

PrintWriter pw=new PrintWriter(sk.getOutputStream(),true);
pw.println("Server : my name is neetika university rollno is 1018685 stay safe");
pw.close();

}
catch(Exception e)
{}
}
}
