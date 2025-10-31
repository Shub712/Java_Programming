///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = PrintOddNumber
//  Description = It is use to print Odd numbers till the input
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintOddNumber(int iNo)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)                       // Business Logic
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(+iCnt);
            }
        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program3
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintOddNumber(20);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   6             Output -  1  3  5
//  Input1 -   10            Output -  1  3  5  7  9
//
/////////////////////////////////////////////////////////////////////////////