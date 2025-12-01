////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : CountCapital
//  Description :   It used count the capital characters from the string
//  Input   :       String
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Marvellous
{
    public int CountCapital(char Brr[])
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt<Brr.length; iCnt++)
        {
            if(Brr[iCnt]>='A' && Brr[iCnt]<='Z')
            {
                iCount++;
            }
        }
        return iCount;  
    }
}

///////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
/////////////////////////////////////////////////////////////////////////

class program1
{
    public static void main(String A[])
    {
        int iRet = 0;

        Scanner scanobj = new Scanner (System.in);

        System.out.println("Enter The String :");
        String sobj = scanobj.nextLine();

        char Arr[]= sobj.toCharArray();

        Marvellous mobj = new Marvellous();

        iRet = mobj.CountCapital(Arr);

        System.out.println("The capital characters are :"+iRet);

    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : Shubham     Ouput : The capital characters are 1
//  Input :  DOG         Ouput : The capital characters are 3	
//  
//
//////////////////////////////////////////////////////////////////////////////////