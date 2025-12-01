////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : CountCapital
//  Description :   It used count the difference between capital and small 
//                  characters
//  Input   :       String
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Marvellous
{
    public int Difference(char Brr[])
    {
        int iCnt = 0, iCountSmall = 0, iCountCapital = 0;

        for(iCnt = 0; iCnt<Brr.length; iCnt++)
        {
            if(Brr[iCnt]>='a' && Brr[iCnt]<='z')
            {
                iCountSmall++;
            }
            else if((Brr[iCnt]>='A') && (Brr[iCnt]<='Z'))
            {
                iCountCapital++;
            }
        }
        return (iCountSmall-iCountCapital);  
    }
}

///////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application  
//
/////////////////////////////////////////////////////////////////////////

class program3
{
    public static void main(String A[])
    {
        int iRet = 0;

        Scanner scanobj = new Scanner (System.in);

        System.out.println("Enter The String :");
        String sobj = scanobj.nextLine();

        char Arr[]= sobj.toCharArray();

        Marvellous mobj = new Marvellous();

        iRet = mobj.Difference(Arr);

        System.out.println("The Difference is :"+iRet);

    }
}
///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : Shubham     Ouput : The difference is 5
//  Input :  dog         Ouput : The difference is 3	
//  
//
//////////////////////////////////////////////////////////////////////////////////  