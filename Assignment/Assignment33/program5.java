////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : ExamSchedule
//  Description :   Used to give exam schedule of the Divisons
//  Input   :       character
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Division
{
    public void ExamSchedule(char ch)
    {   
        if((ch=='A')|| (ch =='a'))
        {
            System.out.println("Your Exam at 7 AM");
        }
        else if ((ch == 'B') || (ch == 'b')) 
        {
            System.out.println("Your Exam at 8.30 AM");
            
        }
        else if ((ch == 'C') || (ch == 'c'))
        {
            System.out.println("Your Exam at 9.20 AM");
            
        }
        else if ((ch == 'D') || (ch =='d'))
        {
            System.out.println("Your Exam at 10.30 AM");    
        }
    }
}

/////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
/////////////////////////////////////////////////////////////////////////

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';

        System.out.println("Enter The Division :");
        cValue = sobj.next().charAt(cValue);

        Division dobj = new Division();

        dobj.ExamSchedule(cValue);

    }
}

//////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
// 
//  Input :  A      Ouput : "Your Exam at 7 AM"
//  Input :  c      Ouput : "Your Exam at 9.20 AM"
// 
//////////////////////////////////////////////////////////////////////////////////