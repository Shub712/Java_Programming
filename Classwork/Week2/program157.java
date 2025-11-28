import java.util.*;

// Input : 6
// Output : -6   -5   -4   -3   -2   -1

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0; 
        for(iCnt = -iNo; iCnt<=-1; iCnt++)
        {
            System.out.print(iCnt+"\t"); 
        }

        System.out.println();
    }
}

class program157
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