///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CalculatePower
//  Description = It is used to print power of the numbers
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CalculatePower(int iBase, int iExp)
    {
        int iRet = 1;
        int iCnt = 0;

        for(iCnt=1; iCnt<=iExp; iCnt++)
        {
            iRet = iRet * iBase;                                // Business Logic
        }

        System.out.println(+iRet);

    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program5
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CalculatePower(2, 5);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  2    Input2 -  5         Output - 32
//  
/////////////////////////////////////////////////////////////////////////////