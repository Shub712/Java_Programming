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
//  Function Name : creatNewFile()
//  Description :   is used to creat the new file.
//  Input :         File Name 
//  Output :        NA
//  Author :        Shubham Kiran Pawar
//  Date :          28/01/2026
//
/////////////////////////////////////////////////////////////////////

class program4
{
    public static void main(String A[])
    {   
        boolean  bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name (with extension) : ");

        String FileName = sobj.nextLine();

        try
        {
            File fobj = new File(FileName);
            bRet = fobj.createNewFile();

            if(bRet)
            {
                System.out.println("File is Successfully created");
            }
            else
            {
                System.out.println("File is Already exists");
            }
        }

        catch(IOException e)
        {
            System.out.println("Error occured while creating file : "+ e);
        }

    }
}
