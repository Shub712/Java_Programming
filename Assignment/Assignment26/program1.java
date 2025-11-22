////////////////////////////////////////////////////////////////////////
//
//  Required Header Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   Function is use to display the alphabets from 
//  Input   :       Integer
//  Output  :       Characters(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :       21/11/2025
//
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0 ;
        char ch = 0;
        
        for(iCnt = 0; iCnt<iNo; iCnt++)
        {
            ch = (char)('A'+iCnt);
            System.out.print(ch+"\t");                // Business Logic
        }

        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Enrty point function of a application
//
////////////////////////////////////////////////////////////////////////

class program1
{
    public static void main( String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter The Number of Elements :");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}

////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input : 5       Output : A  B   C   D   E
//  Input : 2       Output : A  B
//
////////////////////////////////////////////////////////////////////////
