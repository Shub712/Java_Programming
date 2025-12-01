////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////


import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   Used to convert small character to capital and capital
//                  character to small
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
        if((ch >='A')&& ch <='Z')
        {
            ch = (char)(ch + 32);
            System.out.println(ch);
        }
        else if((ch >='a') && (ch<='z'))
        {
            ch = (char)(ch - 32);
            System.out.println(ch);
        }

    }
}

/////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
/////////////////////////////////////////////////////////////////////////

class program2
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
//  Input :  A      Ouput : a
//  Input :  d      Ouput : C
// 
//////////////////////////////////////////////////////////////////////////////////