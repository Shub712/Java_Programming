///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CheckLeapYear
//  Description = It is use to check if year is a leap year or not
//  Input =   Integer
//  Output =  string
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckLeapYear(int iNo)
    {
        if(iNo % 4 == 0 && iNo % 100 !=0 || (iNo % 400 == 0))               // Business Logic
        {
            System.out.println("It is a Leap year");
        }
        else
        {
            System.out.println("It is NOT a Leap year");

        }
    

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
        obj.CheckLeapYear(2024);
    }
}


/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  2024         Output - It is a leap year
//  Input1 -  1900         Output - It is a NOT leap year number
// 
//  
//                           
//  
//
/////////////////////////////////////////////////////////////////////////////