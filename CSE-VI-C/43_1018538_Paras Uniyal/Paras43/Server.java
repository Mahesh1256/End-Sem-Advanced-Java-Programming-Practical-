import java.net.*;
import java.io.*;

public class Server
{
  public static void main(String args[])throws Exception
  {


    ServerSocket ss=new ServerSocket(8080);
    Socket soc=ss.accept();

    System.out.println("Online");

    DataInputStream dataReadparas=new DataInputStream(soc.getInputStream());
    DataOutputStream dataWriteparas=new DataOutputStream(soc.getOutputStream());
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

    String str1="",str2="";

    while(!str1.equals("adios"))
    {
      str1=dataReadparas.readUTF();
      System.out.println("TARS :"+str1);
      str2=br.readLine();
      dataWriteparas.writeUTF(str2);
      dataWriteparas.flush();
    }
  dataReadparas.close();
  soc.close();
  ss.close();
  }
}