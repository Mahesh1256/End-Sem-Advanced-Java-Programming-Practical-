import java.io.*;
import java.net.*;
class cSideTCP {
public static void main(String []args) {
try {
Socket sc= new Socket("localhost", 4444);
DataOutputStream d_o = new DataOutputStream(sc.getOutputStream());
DataInputStream d_i = new DataInputStream(sc.getInputStream());
BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

String str_c;
do {
str_c = br.readLine();
d_o.writeUTF(str_c);
d_o.flush();
System.out.println(d_i.readUTF());
}
while(!str_c.equals("stop"));
sc.close();
}
catch(Exception e) {
System.out.println(e);
}
}
}

