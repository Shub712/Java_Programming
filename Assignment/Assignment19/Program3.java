///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CheckDivisible
//  Description = It is used to check whether number is divisible by 5 and 11
//  Input =   Integer
//  Output =  string (grade displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckDivisible(int iNo)
    {
        if(iNo % 5 ==0 && iNo%11==0)
        {
            System.out.println("It is Divisible by 5 and 11");              // Business Logic
        }
        else
        {
            System.out.println("It is NOT Divisible by 5 and 11");
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
        obj.CheckDivisible(55);
    }
}


/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  55           Output - It is Divisible by 5 and 11.
//  Input1 -  73           Output - It is NOT divisible by 5 and 11.
// 
/////////////////////////////////////////////////////////////////////////////