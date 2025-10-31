///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CheckSign
//  Description = It is use to check whwther number is prime, negative, zero
//  Input =   Integer
//  Output =  string
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckSign(int iNo)
    {
        if(iNo>0)
        {
            System.out.println("It is a positive number");
        }

        if(iNo<0)
        {
            System.out.println("It is a negative number");     // Business Logic

        }
        if(iNo == 0)
        {
            System.out.println("It is a zero number");
        }

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
        obj.CheckSign(3);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   2         Output - It is a positive number
//  Input1 -  -3         Output - It is a negative number
//  Input1 -   0         Output - It is a zero number
//  
//                           
//  
//
/////////////////////////////////////////////////////////////////////////////