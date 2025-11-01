///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CheckPerfectNumber
//  Description = It is used to check whether number is perfect or not
//  Input =   Integer
//  Output =  String (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckPerfectNumber(int iNo)
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt=1; iCnt<=iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)                                             // Business Logic
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is NOT a perfect number");

        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Pogram3
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckPerfectNumber(28);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  28          Output - It is a perfect number
//  Input1 -  34          Output - It is Not a perfect number
//
//                                 
/////////////////////////////////////////////////////////////////////////////