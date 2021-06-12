import java.io.*;
import java.net.*;

public class Client{
public static void main(String args[])throws Exception
{

  Socket soc=new Socket("192.168.43.175",8080);

  DataInputStream dataReadparas=new DataInputStream(soc.getInputStream());

  DataOutputStream dataWriteparas=new DataOutputStream(soc.getOutputStream());

  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  String str1="",str2="";

  while(!str1.equals("adios"))
  {
    str1=br.readLine();
    dataWriteparas.writeUTF(str1);
    dataWriteparas.flush();
    str2=dataReadparas.readUTF();
    System.out.println("R2D2 : "+str2);
  }

dataReadparas.close();
soc.close();
}
}