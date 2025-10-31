///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CheckPlaindrome
//  Description = It is use to check if the number is plaindrome or not.
//  Input =   Integer
//  Output =  String
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckPalindrome(int iNo)
    {
        int iNum = iNo;

        int iRev = 0, iRem = 0;

        while(iNo>0)
        {
            iRem = iNo % 10;

            iRev = iRev * 10 + iRem;

            iNo = iNo /10; 
        } 

        if(iNum == iRev)                                                    // Business Logic
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is NOT a palindrome number");

        }
    }
}

// Time Complexity = O(n)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);
        obj.CheckPalindrome(1234);
    
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   1234       Output -  It is NOT a palindrome number.
//  Input1 -   121        Output -  It is a Palindrome number .
//
/////////////////////////////////////////////////////////////////////////////