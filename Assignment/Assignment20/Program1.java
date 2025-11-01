///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = SumOfEvenNumbers
//  Description = It is used to calculate sum of even numbers
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void SumOfEvenNumbers(int iNo)
    {
        int iCnt=0, iSum=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            if (iCnt % 2 ==0)
            {
                iSum = iSum+ iCnt;                            // Business Logic
            }
        }

        System.out.println(+iSum);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program1
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.SumOfEvenNumbers(10);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  10          Output - 30
//  
/////////////////////////////////////////////////////////////////////////////