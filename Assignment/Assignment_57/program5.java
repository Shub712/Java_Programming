/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////
//
//  Class Name : DirectoryFiles
//
/////////////////////////////////////////////////////////////////////

class DirectoryFiles
{
    /////////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Displays all file names and their sizes
    //
    /////////////////////////////////////////////////////////////////////
    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() == false || fobj.isDirectory() == false)
        {
            System.out.println("Invalid directory");
            return;
        }

        File Arr[] = fobj.listFiles();

        System.out.println("\nFile Name\t\tSize (Bytes)");
        System.out.println("---------------------------------------");

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].isFile())
            {
                System.out.println(Arr[i].getName() + "\t\t" + Arr[i].length());
            }
        }
    }
}
