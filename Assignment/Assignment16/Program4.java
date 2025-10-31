///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = ReverseNumber
//  Description = It is use print number reverse
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void ReverseNumber(int iNo)
    {
        int iRem = 0;
        int iRev = 0;

        while(iNo!=0)
        {
            iRem = iNo % 10;
            iRev = iRev * 10 + iRem;                                        // Business Logic
            iNo = iNo /10;
        }

        System.out.println(+iRev);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////


class Program4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();

        obj.ReverseNumber(1234);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   1234       Output - 4321
//  Input1 -   321       Output -  123
//
///////////////////////////////////////////////////////////////////////////