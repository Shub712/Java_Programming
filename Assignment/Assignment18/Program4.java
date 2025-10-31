///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = SumEvenOddDigits
//  Description = It is use to print sum of Odd and even digits seperately
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void SumEvenOddDigits(int iNo)
    {
        int iDigit= 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        while(iNo!=0)
        {
            iDigit = iNo % 10;

            if(iDigit%2==0)
            {
                iSumEven = iSumEven + iDigit;                                  // Business Logic
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("The sum of even number is :"+iSumEven);
        System.out.println("The sum of Odd number is :"+iSumOdd);


    }
   
}

// Time Complexity = O(n)

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
        obj.SumEvenOddDigits(123456);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   123456         The sum of even number is :12
//                            The sum of Odd number is :9
//  
//
/////////////////////////////////////////////////////////////////////////////