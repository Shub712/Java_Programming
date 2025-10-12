interface Demo
{
    int No = 11;

    void display();
}

 class Hello implements Demo
{
    public void display()
    {
        System.out.println("Inside Display");
    }
}

class InterfaceDemo3
{
    public static void main(String A[])
    {   
        System.out.println(Demo.No);     //No is public and static
        Demo.No = 12;                    //Error because No variable is final

        Hello hobj = new Hello(); 

        hobj.display();
    }
}