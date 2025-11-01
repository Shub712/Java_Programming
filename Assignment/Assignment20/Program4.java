///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = FindlargestDigit
//  Description = It is used to find the largest number
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void FindLargestDigit(int iNo)
    {
        int iLarge=0, iDigit=0;

        while(iNo>0)
        {
            iDigit = iNo%10;

            if(iDigit>iLarge)                                       // Business Logic
            {
                iLarge = iDigit;
            }

            iNo = iNo /10;
        }

        System.out.println(+iLarge);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program4
{
    public static void main(String[] args)
    {
        Logic obj= new Logic();
        obj.FindLargestDigit(2398);

    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  2898          Output - 9
//  Input1 -  45623         Output - 6
//
//                                 
/////////////////////////////////////////////////////////////////////////////

