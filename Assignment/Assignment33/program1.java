////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkAlpha
//  Description :   Used to check whether input is a character or not
//  Input   :       Character
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Alphabets
{
    public Boolean ChkAlpha(char ch)
    {
        if((ch>='A') && (ch<='Z'))
        {
            return true;
        }
        else if((ch>='a') && (ch<='z'))
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

class program1
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        char cValue = '\0';

        boolean bRet = false;
        
        System.out.println("Enter The character :");

        cValue = sobj.next().charAt(cValue);

        Alphabets aobj = new Alphabets();

        bRet = aobj.ChkAlpha(cValue);
        
        if(bRet == true)
        {
            System.out.println("It is a character");
        }
        else
        {
            System.out.println("It is not a character");
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
// 
//  Input :  C      Ouput : It is a character
//  Input :  &      Ouput : It is not a character
// 
//////////////////////////////////////////////////////////////////////////////////