///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = PrintEvenNumber
//  Description = It is use to print even numbers till the input
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintEvenNumber(int iNo)
    {
        int iCnt=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)                       // Business Logic
        {
            if(iCnt % 2 == 0)
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

class Program2
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintEvenNumber(20);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   6             Output -  2  4  6
//  Input1 -   10            Output -  2  4  6  8  10
//
/////////////////////////////////////////////////////////////////////////////