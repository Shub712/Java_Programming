///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = PrintTable
//  Description = It is use to print the table.
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintTable(int iNo)
    {
        int iCnt=0;

        for(iCnt = 1; iCnt<=10; iCnt++)
        {
            System.out.println( +(iNo * iCnt) );                            // Business logic
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
        obj.PrintTable(2);    
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   2             Output -  2  4  6  8  10  12  14  16  18  20
//  Input1 -   3             Output -  3  6  9  12 15  18  21  24  27  30
//
/////////////////////////////////////////////////////////////////////////////