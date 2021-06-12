import java.net.*;
import java.io.*;
class sSideTCP {
public static void main(String [] args) {
try {
ServerSocket ss= new ServerSocket(4444);
Socket sk = ss.accept();
DataInputStream d_is = new DataInputStream(sk.getInputStream());
DataOutputStream d_os= new DataOutputStream(sk.getOutputStream());
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
String str_s;
do {
System.out.println(d_is.readUTF());
str_s = br.readLine();
d_os.writeUTF(str_s);
d_os.flush();
} while(!str_s.equals("stop"));
//sk.close();
}
catch(Exception e) {
System.out.println(e);
}
}
}
