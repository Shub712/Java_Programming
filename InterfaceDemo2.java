interface AbstractDemo1
{
    int No = 11;

    void display();
}

abstract class Hello implements AbstractDemo1
{

}

class InterfaceDemo2
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();  //ERROR
    }
}