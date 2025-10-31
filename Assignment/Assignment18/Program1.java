///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = PrimeNumber
//  Description = It is use to check whether the number is prime or not
//  Input =   Integer
//  Output =  String
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrimeNumber(int iNo)
    {
      int iCnt = 0;
      boolean bPrime = true;

      if(iNo<=1)
      {
        bPrime = false;
      }

      else
      {
        for(iCnt=2; iCnt<=iNo/2 ; iCnt++)
        {
            if(iNo % iCnt ==0)                                          // Business Logic
            {
                bPrime = false;
                break;
            }
        }

      }

      if(bPrime)
      {
        System.out.println("Is a prime number");
      }
      else
      {
        System.out.println("Is not a prime number");

      }
    
    }
}

// Time Complexity = O(n/2)

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
        obj.PrimeNumber(3);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   2             Output -  It is not a prime number
//  Input1 -   3             Output -  It is a prime number
//
/////////////////////////////////////////////////////////////////////////////