///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = DisplayFactors
//  Description = It is used to display factors of a number
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void DisplayFactors(int iNo)
    {
        int iCnt =0;

        for(iCnt = 1; iCnt<=iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0) //Factor Display                    Business Logic
            {
                System.out.println(+iCnt);
            }
        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
////////////////////////////////////////////////////////////////////////////

class Program3
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.DisplayFactors(12);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  12             Output -   1
//                                      2
//                                      3
//                                      4
//                                      6
//
//                                 
/////////////////////////////////////////////////////////////////////////////