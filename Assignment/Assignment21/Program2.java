///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CountEvenOddRange
//  Description = It is used to count even and odd numbers range
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CountEvenOddRange(int iNo)
    {
        int iEven = 0,iCnt=0, iOdd=0;

        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            if(iCnt % 2 == 0)   // Check Even                               // Business Logic
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("The Even Numbers are = "+iEven);
        System.out.println("The Odd Numbers are = "+iOdd);
    
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////


class Program2
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.CountEvenOddRange(50);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  50           Output - The Even Numbers are 25
//                                  The Odd Numbers Are 25
//
//                                 
/////////////////////////////////////////////////////////////////////////////