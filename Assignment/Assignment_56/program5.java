import java.util.*;
import java.io.*;

/////////////////////////////////////////////////////////////////////
//
//  Function Name : isExists()
//  Description :   is used to display  the list of files.
//  Input :         Directory Name 
//  Output :        list
//  Author :        Shubham Kiran Pawar
//  Date :          28/01/2026
//
////////////////////////////////////////////////////////////////////
/// 
class program5
{
    public static void main(String A[])
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Directory Name : ");
        String DirName = sobj.nextLine();
        
        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            String files[] = fobj.list();

            for(i = 0; i<files.length; i++)
            {
                System.out.println(files[i]);
            }
        }

        else
        {
            System.out.println("Directory doesnt exists");
        }

    }
}