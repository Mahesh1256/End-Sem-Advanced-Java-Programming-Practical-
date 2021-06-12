//Saurabh Chauhan
//Sec-C
//Roll No-58
//Client class
import java.io.*;  
import java.net.*;  
public class Client {  
 public static void main(String[] args) throws Exception {
        Socket s=new Socket("localhost",1010);//local host
        DataInputStream dR=new DataInputStream(s.getInputStream());//Reading 
        DataOutputStream dW=new DataOutputStream(s.getOutputStream());//Writing
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//To take the input

        String str="",str2="";
        while(!str.equals("bye")){
            str=br.readLine();//read
            dW.writeUTF(str);//write
            dW.flush();
            str2=dR.readUTF();
            System.out.println("Server says: "+str2);
        }

        dR.close(); //close
        s.close();
    }
}  