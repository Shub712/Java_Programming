/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////
//
//  Class Name : CreateDirectory
//
/////////////////////////////////////////////////////////////////////

class CreateDirectory
{
    /////////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Accepts directory name from user and creates it
    //
    /////////////////////////////////////////////////////////////////////
    
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists())
        {
            System.out.println("Directory already exists");
        }
        else
        {
            boolean bRet = fobj.mkdir();

            if(bRet == true)
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Unable to create directory");
            }
        }
    }
}
