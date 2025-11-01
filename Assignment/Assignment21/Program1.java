///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = ProductOfDigit
//  Description = It is used to find product of digits(2*3*4)
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void ProductOfDigit(int iNo)
    {
        int iMult= 1;
        int iDigit = 0;

        while(iNo!=0)
        {
            iDigit = iNo % 10;
            iMult = iMult * iDigit;                             // Business Logic
            iNo = iNo /10;
        }

        System.out.println(+iMult);
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
        Logic obj= new Logic();
        obj.ProductOfDigit(234);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  234           Output - 24
//  
//
//                                 
/////////////////////////////////////////////////////////////////////////////