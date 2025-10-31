///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = Factorial
//  Description = It is use find the factorial.
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void Factorial(int num)
    {
        int iCnt = 0;
        int iFact = 1;

        for(iCnt = 1; iCnt<=num; iCnt++)
        {
            iFact = iFact*iCnt;                                           // Business logic
        }

        System.out.println(+iFact);
    }
}

// Time Complexity O(n)


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

        obj.Factorial(8);
    }
           
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   5       Output - 120
//  Input1 -   8       Output - 40320
//
///////////////////////////////////////////////////////////////////////////