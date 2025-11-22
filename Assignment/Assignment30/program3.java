////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   Function is use to display the Pattern  
//  Input   :       Integer
//  Output  :       * and #(to show on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :       22/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0 ;

        for(i=1; i<=iRow; i++)
        {
            for(j=1; j<=iCol; j++)
            {
                if(i==j)
                {
                    System.out.print("$\t");
                }
                else                                                // Business Logic
                {
                    System.out.print("*\t");
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

class program2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter The Number Of Rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter The Number Of Columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    
    }    
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : 5      Input2 : 5       Output :   $	*	*	*	*	
//                                              *	$	*	*	*	
//                                              *	*	$	*	*	
//                                              *	*	*	$	*	
//                                              *	*	*	*	$						
//////////////////////////////////////////////////////////////////////////////////
