/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////


import java.io.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.*;     // nio is for new input output

/////////////////////////////////////////////////////////////////////
//
//  Function Name : FileWriter()
//  Description :   is used to write the contents in the file.
//  Input :         File Name, and data 
//  Output :        file data
//  Author :        Shubham Kiran Pawar
//  Date :          28/01/2026
//
/////////////////////////////////////////////////////////////////////

class program3
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name (with extension) : ");

        String FileName = sobj.nextLine();
        String Data = " India is my country";

        try
        {
            FileWriter writer = new FileWriter(FileName,true);

            writer.write(Data);

            System.out.println("Successfully wrote the data");

            writer.close();
        }

        catch(IOException e)
        {
            System.out.println("Error occured while writing file : "+ e);
        }

    }
}
