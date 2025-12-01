////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   It used to give ASCII value
//  Input   :       Character
//  Output  :       digit(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Alphabet
{
    public void Display(char ch)
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {   
            System.out.println(+ch);
        }
        else if((ch >= 'a') && (ch <= 'a'))
        {
            System.out.println(+ch);

        }
    }
}

///////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
/////////////////////////////////////////////////////////////////////////

class program5
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
//  Input1 : A      Ouput : 65
//  Input :  a      Ouput : 97	
//  
//
//////////////////////////////////////////////////////////////////////////////////

