import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer2
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
    }
}