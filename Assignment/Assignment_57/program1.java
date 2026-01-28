import java.util.*;
import java.io.*;

/////////////////////////////////////////////////////////////////////
//
//  Function Name : main()
//  Description   : Accepts two file names from user. Opens the first
//                  file in read mode, creates a new file with the
//                  second name, and copies all data from the first
//                  file into the newly created file.
//  Input         : Source file name, Destination file name
//  Output        : Copies data from source file to destination file
//  Author        : Shubham Kiran Pawar
//  Date          : 28/01/2026
//
/////////////////////////////////////////////////////////////////////


class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Source File Name : ");
        String src = sobj.nextLine();

        System.out.println("Enter The Destination File Name : ");
        String dest = sobj.nextLine();

        try
        {
            FileInputStream fin = new FileInputStream(src);             // FileInputStream used to  open file in read mode  
            FileOutputStream fout = new FileOutputStream(dest);         // FileOutputStram used to create file in write mode

            int Data = 0;

            while ((Data = fin.read()) != -1)                           // it reads data 1 byte at a time
            {
                fout.write(Data);
            }

            fin.close();
            fout.close();

            System.out.println("Data Copied Successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error : " +e);
        }
    }
}

/*
    Flow of Execution :

    Start
    ↓
    Accept source file name
    ↓
    Accept destination file name
    ↓
    Open source file (read)
    ↓
    Create destination file (write)
    ↓
    Read byte → Write byte
    ↓
    Repeat till EOF
    ↓
    Close files
    ↓
    End
*/
