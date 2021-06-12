//client server two way communication using socket programming in one machine
import java.io.*;//input output operations
import java.net.*;//to import socket class to establish connection at client side
class client{
    public static void main(String args[])throws Exception{
            Socket s = new Socket("localhost",8080); //giving domainname and port no of server
            DataInputStream dataread = new DataInputStream(s.getInputStream());
            DataOutputStream datawrite = new DataOutputStream(s.getOutputStream());//write data on buffer
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            String str2 = "";
            while(!str.equals("bye")){
                str = br.readLine();//reading from keyboard and converting it into string
                datawrite.writeUTF(str);
                datawrite.flush();
                str2 = dataread.readUTF();//reading server's meesege
                System.out.println("Server Says : "+ str2);//printing server's messege
       }
            dataread.close();
            s.close();//closing connection
    }
}