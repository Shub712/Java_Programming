
class ThreadPriority
{
    public static void main (String A[])
    {
        System.out.println("Inside main method");

        Thread tobj = Thread .currentThread();

        String Name = tobj.getName();
        System.out.println("Name of current thread is :"+Name);
        int Priority = tobj.getPriority();

        System.out.println("Priority of current is : "+Priority); //5
        tobj.setPriority(10);
        
        Priority = tobj.getPriority();
        System.out.println("Priority of current is : "+Priority); //10
    }
}