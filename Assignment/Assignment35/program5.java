////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name : strRev
//  Description :   It used to display the string in reverse order
//  Input   :       String
//  Output  :       String(To display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :       1/12/2025
//
///////////////////////////////////////////////////////////////////////

class Marvellous
{
    public void strRev(char Brr[])
    {
        int Start = 0;
        int End = 0;
        char temp = '\0';

        Start = 0;
        End = Brr.length-1;

        while(Start<End)
        {
            temp = Brr[Start];
            Brr[Start] = Brr[End];
            Brr[End] = temp;

            Start ++;
            End --;
        }

        System.out.println(Brr);
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
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter The String :");

        String sobj = scanobj.nextLine();
        
        char Arr[]= sobj.toCharArray();

        Marvellous mobj = new Marvellous();

        mobj.strRev(Arr);

    }
}

///////////////////////////////////////////////////////////////////////////////////
//  
//  Test Cases  :
//  
//  Input1 : Shubham     Ouput : mahbuhs
//  Input :  dog         Ouput : god	
//  
//
////////////////////////////////////////////////////////////////////////////////// 