///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = CountFactors
//  Description = It is used to count factors of a number
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CountFactors(int iNo)
    {
        int iCnt =0, iFact=0;

        for(iCnt=1; iCnt<=iNo/2; iCnt++)
        {
            if(iNo%iCnt==0)                                                  // Business Logic
            {
                iFact++;
            }
        }

        System.out.println(+iFact);
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
        obj.CountFactors(12);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  12           Output - 5
//
//                                 
/////////////////////////////////////////////////////////////////////////////