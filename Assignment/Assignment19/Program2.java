///////////////////////////////////////////////////////////////////////////////
//
//  Function Name = DisplayGrade
//  Description = It is used to display the grade of a student based on marks
//  Input =   Integer
//  Output =  string (grade displayed on console)
//  Author =  Shubham Kiran Pawar
//  Date =    01/11/2025
//
///////////////////////////////////////////////////////////////////////////////

class Logic
{
    void DisplayGrade(int iNo) 

    {
       if(iNo>=90)
       {
        System.out.println("A+");
       }
        else if(iNo>=80)
       {
        System.out.println("A");
       } 
       else if(iNo>=70)
       {
        System.out.println("B+");                          // Business Logic
       }
        else if(iNo>=60)
       {
        System.out.println("B");
       }
       else if(iNo>=50)
       {
        System.out.println("C");
       }
       else if(iNo>=40)
       {
        System.out.println("-D");
       }

       else
       {
        System.out.println("F");
       }


    }
}

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
        obj.DisplayGrade(82);
    }
}


/////////////////////////////////////////////////////////////////////////////
//
//  Test Cases
//  
//  Input1 -  82           Output - A
//  Input1 -  73           Output - B+
// 
//  
//                           
//  
//
/////////////////////////////////////////////////////////////////////////////