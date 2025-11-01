///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = FindSmallestDigit
//  Description = It is used to find the Smallest number
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
        int iSmall=9, iDigit=0;

        while(iNo>0)
        {
            iDigit = iNo%10;

            if(iDigit<iSmall)                                       // Business Logic
            {
                iSmall = iDigit;
            }

            iNo = iNo /10;
        }

        System.out.println(+iSmall);
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
        Logic obj= new Logic();
        obj.FindLargestDigit(2398);

    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  2898          Output - 2
//  Input1 -  45623         Output - 2
//
//                                 
/////////////////////////////////////////////////////////////////////////////

