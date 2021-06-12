import java.io.*;
import java.net.*;//importing  serversocket class to establish connection at server side

class server{
    public static void main(String args[])throws Exception{//handling exceptions
            ServerSocket ss = new ServerSocket(8080);//providing port number to server
            Socket s= ss.accept();//returns details of client connected
            DataInputStream dataread = new DataInputStream(s.getInputStream());//read data from buffer 
            DataOutputStream datawrite = new DataOutputStream(s.getOutputStream());//write data to buffer
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str ="";
            String str2 = "";
            while(!str.equals("bye")){
                str = dataread.readUTF();//converting client's messege to string 
                System.out.println("Client Says : "+ str );//printing client's messege
                str2 = br.readLine();
                datawrite.writeUTF(str2);
                datawrite.flush();
            }
            dataread.close();//closing connections
            s.close();
            ss.close();
    }
}