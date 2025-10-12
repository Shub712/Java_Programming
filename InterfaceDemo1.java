interface AbstractDemo1
{
    int No = 11;

    void display();
}

class Hello implements AbstractDemo1
{
    //Error
}

class InterfaceDemo1
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}