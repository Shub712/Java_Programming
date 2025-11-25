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
               if(i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print("*\t");
                }
                else if(i+j==7)
                {
                    System.out.print("*\t");
                }
                else if(i >= 2 && i <= iRow-2 && j <= (iCol - (i - 2)))
                {
                    // # region
                    System.out.print("#\t");
                }
                else if(i >= 3 && i <= iRow-1 && j >= (i + 2))
                {
                    // $ region
                    System.out.print("$\t");
                }
                else
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
//  Input1 : 6      Input2 : 6       Output :   *	*	*	*   *   *	
//                                              *   #   #   #    *  *                          
//                                             	*   #   #   *   $   *
//                                            	*	#	*	$   $   *
//						                        *   *   $   $   $   *
//                                              *  *    *   *   *   *   
//////////////////////////////////////////////////////////////////////////////////