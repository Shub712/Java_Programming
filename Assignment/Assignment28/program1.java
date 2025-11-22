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
//  Output  :       Alphabets(to show on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :       21/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1; i<=iRow; i++)
        {
            for(j=1, ch = 'A'; j<=iCol; j++,ch++)
            {
               System.out.print(ch+"\t");
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

class program1
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
//  Input1 : 4      Input2 : 4       Output :   A	B	C	D	
//                                              A	B	C	D	
//                                              A	B	C	D	
//                                              A	B	C	D	
//
//////////////////////////////////////////////////////////////////////////////////