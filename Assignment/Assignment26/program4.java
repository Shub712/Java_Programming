////////////////////////////////////////////////////////////////////////
//
//  Required Header Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   Function is use to display the Pattern  
//  Input   :       Integer
//  Output  :       Integer & *
//  Author  :       Shubham Kiran Pawar
//  Date    :       21/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0, iCount = 0 ;
        
        iCount = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {   
            System.out.print("#\t");                            // Business Logic
            System.out.print(iCnt+"\t");                         
            System.out.print("*\t");                              
        }
        System.out.println();
    }
}

// Time Complexity : O(N2)

////////////////////////////////////////////////////////////////////////
//
//  Enrty point function of a application
//
////////////////////////////////////////////////////////////////////////

class program4  
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter The number of elements : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input : 5       Output : #  1  *   #  2   *   # 3   *   #    4   *   #   5   *   
//  Input : 2       Output : #  1  *   #  2   *
//
//////////////////////////////////////////////////////////////////////////////////