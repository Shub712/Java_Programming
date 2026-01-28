/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////


import java.io.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.*;     // nio is for new inpur output

/////////////////////////////////////////////////////////////////////
//
//  Function Name : readString()
//  Description :   is used to read the contents of file.
//  Input :         File Name 
//  Output :        file data
//  Author :        Shubham Kiran Pawar
//  Date :          28/01/2026
//
/////////////////////////////////////////////////////////////////////

class program2
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name (with extension) : ");

        String FileName = sobj.nextLine();

        try
        {
            Path filepath = Paths.get(FileName);        // Converts file name into path
            String Content = Files.readString(filepath); // Opens the file and read the data, stores into Content String

            System.out.println("File Content are :");
            System.out.println(Content);

        }

        catch(IOException e)
        {
            System.out.println("Error occured while reading file : "+ e);
        }

    }
}
// Flow of execution :

// 1 Ask file name
// 2 Convert it to path
// 3 Read file
// 4 Print file content
// 5 If error → show error message