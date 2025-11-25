//////////////////////////////////////////////////////////////////////////
//
//  Required packages 
//
/////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   Function is use to display the Pattern  
//  Input   :       Integer
//  Output  :        *(to show on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :       25/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i<=iRow; i++)
        {
            for(j=1; j<=iCol; j++)
            {
                if(j==iCol || i==1 || i==iRow || j==1)
                {
                    System.out.print("*\t");                                // Business Logic
                }
                else if(i==j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }

            System.out.println();
        }
    }
}

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
        int iValue1 = 0, iValue2= 0;

        System.out.println("Enter The Number Of Row you Want :");
        iValue1 = sobj.nextInt();


        System.out.println("Enter The Number Of Columns you Want :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : 5      Input2 : 5       Output :   *	*	*	*	*	
//                                              *	*	 	 	*	
//                                              *	 	*	 	*	
//                                              *	 	 	*	*	
//                                              *	*	*	*	*				
//						
//////////////////////////////////////////////////////////////////////////////////