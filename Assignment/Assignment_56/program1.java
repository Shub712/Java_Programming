/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////


import java.io.File;
import java.util.*;
import java.io.IOException;
import java.awt.Desktop;

/////////////////////////////////////////////////////////////////////
//
//  Function Name : open()
//  Description :   is used to open the file.
//  Input :         File Name 
//  Output :        NA
//  Author :        Shubham Kiran Pawar
//  Date :          28/01/2026
//
/////////////////////////////////////////////////////////////////////

class program1
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name (with extension) : ");

        String FileName = sobj.nextLine();

        try
        {
            File fobj = new File(FileName);
                
            if(Desktop.isDesktopSupported())
            {
                Desktop.getDesktop().open(fobj);
            }

        }

        catch(IOException e)
        {
            System.out.println("Error : "+ e);
        }

    }
}