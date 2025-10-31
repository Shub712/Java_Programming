///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = FindMax
//  Description = It is use to find maximum number for given two numbers
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////


class Logic
{
    void FindMax(int iNo1, int iNo2)
    {
        if(iNo1<iNo2)
        {
            System.out.println(+iNo2);                        // Business Logic
        }
         else
        {
            System.out.println(+iNo1);
            
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
        obj.FindMax(12, 10);
    }
}   

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   12,34       Output -  34
//  Input1 -   12,1        Output -  12
//
/////////////////////////////////////////////////////////////////////////////