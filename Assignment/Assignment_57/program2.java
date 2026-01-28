import java.util.*;
import java.io.*;
import java.nio.file.*;



class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Path filePath = Paths.get("/home/shubham/Desktop/Assignments LB/Java_Programming/Assignment_57/demo.txt");

        if(Files.isRegularFile(filePath))
        {
            System.out.println(filePath.getFileName() + " is regular file");
        }
        else
        {
            System.out.println(filePath.getFileName() + " is not regular file");
        }

    }
}

