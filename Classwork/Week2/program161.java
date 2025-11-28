import java.util.*;

// Input : 5
// Output : -5  -4  -3  -2  -1  0   1   2   3   4   5

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0; 
            
        for(iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"\t"); 
        }

        System.out.println();
    }
}

class program161
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