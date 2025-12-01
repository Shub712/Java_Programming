////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkVowel
//  Description :   It used check if string contains vowel in it or not
//  Input   :       String
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :       1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Marvellous
{
    public boolean ChkVowel(char Brr[])
    {
        int iCnt =  0;
        boolean bAns = false;
        for(iCnt = 0; iCnt<Brr.length; iCnt++)
        {
            if(Brr[iCnt]=='a'|| Brr[iCnt]=='e'|| Brr[iCnt]=='i'
            || Brr[iCnt]=='o'|| Brr[iCnt]=='u')
            {
                bAns = true;
            }
        }

        return bAns;
    }

}

///////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application  
//
/////////////////////////////////////////////////////////////////////////

class program4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter The String :");

        String sobj = scanobj.nextLine();
        
        char Arr[]= sobj.toCharArray();

        Marvellous mobj = new Marvellous();

        bRet = mobj.ChkVowel(Arr);

        if(bRet == true)
        {
            System.out.println("It contains vowel ");
        }
        else
        {
            System.out.println("It doesnt contain vowel");
        }

    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : Shubham     Ouput : it contaions vowel
//  Input :  dzg         Ouput : it doesnt contain vowel	
//  
//
////////////////////////////////////////////////////////////////////////////////// 