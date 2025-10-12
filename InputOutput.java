 import java.util.Scanner; 
 
 class InputOutput
 {
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2=0;
        int Ans = 0;

        System.out.println("Enter First Number ;");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Noumber ;");
        iNo2 = sobj.nextInt();

        Ans = iNo1 + iNo2;

        System.out.println("Addition is :"+Ans);

    }
 } 