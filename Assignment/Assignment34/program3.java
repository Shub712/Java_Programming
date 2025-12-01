////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   Used to print the range of characters
//  Input   :       Character
//  Output  :       Character(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Alphabet
{
    public void Display(char ch)
    {
        int iCnt = 0;
        if((ch >='A')&& (ch <='Z'))
        {
            for(iCnt = ch; iCnt<='Z'; iCnt++)
            {
                System.out.print((char)iCnt);
                System.out.print("\t");
            }
        } 

        System.out.println();
        
        else if((ch >='a')&& (ch <='z'))
        {
            for(iCnt = ch; iCnt >= 97 ; iCnt--)
            {
                System.out.print((char)iCnt);
                System.out.print("\t");
            }
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
/////////////////////////////////////////////////////////////////////////

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';

        System.out.println("Enter The character : ");
        cValue = sobj.next().charAt(0);
        Alphabet aobj = new Alphabet();

        aobj.Display(cValue);

    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : V      Ouput :  V	W	X	Y	Z
//  Input :  d      Ouput :  d	c	b	a	
//  
//
//////////////////////////////////////////////////////////////////////////////////