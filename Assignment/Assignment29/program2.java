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
//  Output  :       Integer(to show on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :       21/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iNum = 0;

        for(i = 1; i<=iRow; i++)
        {
            if(i%2==1)
            {
                iNum =2;
            }
            else
            {
                iNum =1;
            }
            for(j =1 ; j<=iCol; j++)
            {
                System.out.print(iNum+"\t");
                iNum += 2;
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
        int iValue1 = 0, iValue2 = 0 ;

        System.out.println("Enter The Number Of Rows:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter The Number Of Columns:");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);
    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : 4      Input2 : 4       Output :   2	4	6	8	
//                                              1	3	5	7	
//                                              2	4	6	8	
//                                              1	3	5	7		
//////////////////////////////////////////////////////////////////////////////////