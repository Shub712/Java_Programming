
///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CountDigit
//  Description = It is use count the number of digits
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CountDigit(int iNo)
    {
        int iCount = 0;
       
        while(iNo!=0)
        {
            iNo = iNo /10;                                                  // Business Logic
            iCount++;                           
        }

        System.out.println(+iCount);
        
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CountDigit(7865);
    }

}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   1234       Output -  4
//  Input1 -   321        Output -  3
//
///////////////////////////////////////////////////////////////////////////