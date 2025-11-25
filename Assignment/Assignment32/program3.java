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
//  Output  :       Pattern-+
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
                if(i+j==5 || i==iRow || i==1 || j==1 || j==iCol)
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

class program3
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
//  Input1 : 4      Input2 : 4       Output :   *	*	*	*	
//                                              *	 	*	*	
//                                              *	*	 	*	
//                                              *	*	*	*					
//						
//////////////////////////////////////////////////////////////////////////////////