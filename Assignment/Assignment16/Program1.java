///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = calculatesum
//  Description = It is use to find the difference between the sum of natural numbers
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculatesum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            iSum = iSum + iCnt;                                             // Business Logic
        }

        System.out.println(+iSum);

    }
}   

// Time Complexity = O(n)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatesum(10);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   10        Output - 55
//   
//
//
////////////////////////////////////////////////////////////////////////////