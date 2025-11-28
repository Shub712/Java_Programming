import java.util.*;

// Input : 5
// Output : *   *   *   *   *

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt =1; iCnt<=iNo; iCnt++)
        {
            System.out.print("*\t");
        }

        System.out.println();
    }
}

class program152
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter The Frequency: ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}