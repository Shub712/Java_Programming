
interface A
{
    int No =11;
    void fun ();
}
interface B
{
    int No =21;
    void fun();
}

class Demo implements A,B    //multiple inheritance
{
    public void fun()
    {
        System.out.println("Inside fun"+No);     //No generates ERR beause of ambiguity 

    }
  
}

class InterfaceDemo6
{
    public static void main(String A[])
    {   
        Demo dobj = new Demo();
        dobj.fun();
    
    }
}