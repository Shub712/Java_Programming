///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = PrintDivisibleBy2and3
//  Description = It is used to print number which is divisible 2 and 3
//  Input =   Integer
//  Output =  Integer (displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////


class Logic
{
    void PrintDivisibleBy2and3(int iNo)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=iNo; iCnt++)
        {
            if(iCnt % 2==0)
            {
                System.out.println("Divisible by 2\t"+iCnt);            // Business Logic
            } 
        }
                                                                        
        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
             if(iCnt%3==0)
            {
                System.out.println("Divisible by 3\t"+iCnt);
            }
            
        }
    }
}


/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of a application
//
///////////////////////////////////////////////////////////////////////////

class Program5
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintDivisibleBy2and3(30);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//
//  Input1 -  30           Output -   //Divisible by 2	2
//                                    //Divisible by 2	4
//                                    //Divisible by 2	6
//                                    //Divisible by 2	8
//                                    //Divisible by 2	10
//                                    //Divisible by 2	12
//                                    //Divisible by 2	14
//                                    //Divisible by 2	16
//                                    //Divisible by 2	18
//                                    //Divisible by 2	20
//                                    //Divisible by 2	22
//                                    //Divisible by 2	24
//                                    //Divisible by 2	26
//                                    //Divisible by 2	28
//                                    //Divisible by 2	30
//                                    //Divisible by 3	3
//                                    //Divisible by 3	6
//                                    //Divisible by 3	9
//                                    //Divisible by 3	12
//                                    //Divisible by 3	15
//                                    //Divisible by 3	18
//                                    //Divisible by 3	21
//                                    //Divisible by 3	24
//                                    //Divisible by 3	27
//                                    //Divisible by 3	3
//                                 
/////////////////////////////////////////////////////////////////////////////