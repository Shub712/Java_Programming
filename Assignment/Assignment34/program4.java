////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   Used to tell if input is a special character or not
//  Input   :       Character
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Alphabet
{
    public boolean Display(char ch)
    {
       if((ch=='!') || (ch == '@') || (ch == '$') || (ch == '%') 
       || (ch == '^') || (ch == '&') || (ch == '*'))
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
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter The character : ");
        cValue = sobj.next().charAt(0);
        Alphabet aobj = new Alphabet();

        bRet = aobj.Display(cValue);
        if(bRet==true)
        {
            System.out.println("It is a special character");
        }
        else
        {
            System.out.println("It is not a special character");
        }

    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : %      Ouput : It is a special character
//  Input :  d      Ouput : It is not a special character	
//  
//
//////////////////////////////////////////////////////////////////////////////////