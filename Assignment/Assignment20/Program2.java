///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = PrintReverse
//  Description = It is used to print number in reverse order
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintReverse(int iNo)
    {
        int iCnt =0;

        for(iCnt=iNo; iCnt>=1; iCnt--)                                     // Business Logic
        {
            System.out.println(+iCnt);
        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program2
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintReverse(10);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  10          Output - 10
//                                 9
//                                 8
//                                 7
//                                 6
//                                 5
//                                 4
//                                 3
//                                 2
//                                 1
/////////////////////////////////////////////////////////////////////////////