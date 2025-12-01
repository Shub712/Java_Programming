////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////////
//
//  Function Name : DisplayASCII
//  Description :   Used to display ASCII Table
//  Input   :       -
//  Output  :       Table(Display on console)
//  Author  :       Shubham Kiran Pawar
//  Date    :      1/12/2025
//
///////////////////////////////////////////////////////////////////////

class ASCII_Table
{
    public static void DisplayASCII()
    {
        System.out.println("Symbol\tDec\tHex\tOct");
        System.out.println("-----------------------------------");

        for(int i = 0; i <= 255; i++)
        {
            char symbol;

        
            if(i >= 32 && i <= 126)
            {
                symbol = (char)i;
            }
            else
            {
                symbol = '.';
            }

            String hex = Integer.toHexString(i).toUpperCase();
            String oct = Integer.toOctalString(i);

            System.out.println(symbol + "\t" + i + "\t" + hex + "\t" + oct);
        }
    }
}


class program1
{
    public static void main(String A[])
    {
        ASCII_Table aobj = new ASCII_Table();
        aobj.DisplayASCII();
    }
}