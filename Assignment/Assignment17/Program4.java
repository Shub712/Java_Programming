///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = FindMinimum
//  Description = It is use to find mimium number for given three numbers
//  Input =   Integer
//  Output =  Integer
//  Author =  Shubham Kiran Pawar
//  Date =    31/10/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void FindMinium(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1<iNo2 && iNo2<iNo3)
        {
            System.out.println(+iNo1);
        }
        else if(iNo2<iNo1 && iNo2<iNo3)                        // Business Logic
        {
            System.out.println(+iNo2);

        }
        else
        {
            System.out.println(+iNo3);
        }

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
        obj.FindMinium(12, 11,3);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -   12,34,3       Output -  3
//  Input1 -   12,1,2        Output -  +1
//
/////////////////////////////////////////////////////////////////////////////