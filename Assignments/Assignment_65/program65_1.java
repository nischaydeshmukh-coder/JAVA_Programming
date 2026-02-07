import java.util.Scanner;

public class program65_1
{
    public static int OFF7Bit(int iNo)
    {
        int iMask = 0;

        iMask = 0xffffffbf;

        iNo = iNo & iMask;

        return iNo;
    }
    public static void main(String[] args) 
    {
        int No = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number :");
        No = sobj.nextInt();

        iRet = OFF7Bit(No);

        System.out.println("Updated number : " +iRet);
    }
    
}