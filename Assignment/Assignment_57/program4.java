/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

/////////////////////////////////////////////////////////////////////
//
//  Class Name : FileChecksum
//
/////////////////////////////////////////////////////////////////////

class FileChecksum
{
    /////////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Accepts file name and calculates checksum
    //
    /////////////////////////////////////////////////////////////////////
    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() == false)
        {
            System.out.println("File not found");
            return;
        }

        try
        {
            FileInputStream fin = new FileInputStream(fobj);

            Checksum checksum = new CRC32();
            int data = 0;

            while((data = fin.read()) != -1)
            {
                checksum.update(data);
            }

            System.out.println("Checksum of file is : " + checksum.getValue());

            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("Error while calculating checksum");
        }
    }
}
