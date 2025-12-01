////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkCapital
//  Description :   Used to check whether input is a capital chracter or not
//  Input   :       Character
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Alphabets
{
    public Boolean ChkCapital(char ch)
    {
        if((ch>='a') && (ch<='z '))
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

class program4
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        char cValue = '\0';

        boolean bRet = false;
        
        System.out.println("Enter The character :");

        cValue = sobj.next().charAt(cValue);

        Alphabets aobj = new Alphabets();

        bRet = aobj.ChkCapital(cValue);
        
        if(bRet == true)
        {
            System.out.println("It is a small character");
        }
        else
        {
            System.out.println("It is not a small character");
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
// 
//  Input :  C      Ouput : It is not  a small character
//  Input :  s      Ouput : It is a small character
// 
//////////////////////////////////////////////////////////////////////////////////