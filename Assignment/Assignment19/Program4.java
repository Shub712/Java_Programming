///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = PrintDigits
//  Description = It is used to print digits seperately
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintDigits(int iNo)
    {
        int iRev = 0, iRem=0     ;

        while(iNo!=0)
        {
            iRem = iNo % 10;
            iRev = iRev*10 + iRem;
            iNo =iNo /10;
        }

        while(iRev>0)                                                       // Business Logic
        {
            iRem = iRev %10;
            System.out.println(+iRem);
            iRev = iRev/10;
        }
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
        Logic obj = new Logic();
        obj.PrintDigits(9087);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  1234           Output -  1
//                                     2 
//                                     3
//                                     4
/////////////////////////////////////////////////////////////////////////////