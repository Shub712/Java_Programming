////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkAlpha
//  Description :   Used to check whether input is a Digit or not
//  Input   :       Digit
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Alphabets
{
    public Boolean ChkDigits(char ch)
    {
        if((ch>='0') && (ch<='9'))
        {
            return true;
        }
        else
        {
            return false;
        }
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
        Scanner sobj= new Scanner(System.in);
        char cValue = '\0';

        boolean bRet = false;
        
        System.out.println("Enter The character :");

        cValue = sobj.next().charAt(cValue);

        Alphabets aobj = new Alphabets();

        bRet = aobj.ChkDigits(cValue);
        
        if(bRet == true)
        {
            System.out.println("It is a Digit");
        }
        else
        {
            System.out.println("It is not a Digit");
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
// 
//  Input :  5      Ouput : It is a Digit
//  Input :  &      Ouput : It is not a Digit
// 
//////////////////////////////////////////////////////////////////////////////////