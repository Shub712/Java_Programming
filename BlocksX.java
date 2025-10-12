class Demo
{
    public int i;                //Instance Varaible
    static public int j;    //Class variable
               

    static
    {
        j = 21;
    }
    
    public Demo()
    {
        this.i = 11;
        System.out.println("Inside Constructor");
    }

   

}

class Blocks
{
    public static void main(String A[])
    {
        System.out.println("Inside Main");


        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
    }
}