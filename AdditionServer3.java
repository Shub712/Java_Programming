import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer3
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server is running...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is Waiting at port number 2100");
        Socket sobj = ssobj.accept();                                               // Waiting phase for client
        System.out.println("Client request arrives and accepted by the server");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());         // For Listening
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());      // For Talking

        int no1 = 0, no2 = 0;

        no1 = diobj.readInt();
        no2 = diobj.readInt();

        int sum = no1+no2;

        doobj.writeInt(sum);


        sobj.close();
        ssobj.close();
        System.out.println("Server Application is terminated");   
    }
}