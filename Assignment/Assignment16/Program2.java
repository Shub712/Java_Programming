///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = checkEvenOdd
//  Description = It is use find Even or Odd number.
//  Input =   Integer
//  Output =  String
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkEvenOdd(int iNo)
    {
        if(iNo%2==0)
        {
            System.out.println("It is Even Number");

        }
        else                                                                // Business Logic
        {   
            System.out.println("It is Odd Number");

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
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   7       Output - It is Odd Number.
//  Input1 -   8       Output - It is Even Number.
//
//   
//
//
////////////////////////////////////////////////////////////////////////////