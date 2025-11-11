// OOP Design

class ArrayX
{
    public int Arr[];         // Array reference
    public int iSize;        // To decide the size of array

    public ArrayX(int No)   // Parameterized Constructor
    {
        iSize = No;                 // No is a for decide the size of array which will go into iSize variable       
        Arr = new int [iSize];      // Intialise Array by giving iSize, to dicide how much bytes of memory we want. 
    }
}


class program103
{
    public static void main(String A[])
    {
        ArrayX aobj1 = new ArrayX(5);           // Created object1 with parameter 5
        ArrayX aobj2 = new ArrayX(7);           // Creater object2 with parameter 7


    }
}


// After passing the parameter as 5 it will get copied into iNo, so the we will get the memory
// of 20 bytes .