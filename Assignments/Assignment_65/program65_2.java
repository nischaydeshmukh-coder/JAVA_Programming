import java.util.Scanner;

public class program65_2
{
    public static int OFF7th10thBit(int iNo)
    {
        int iMask = 0, iMask1 = 0, iMask2 = 0;

        iMask1 = 0xfffffbf;
        iMask2 = 0xffffdff;

        iNo = iNo & iMask1;
        iNo = iNo & iMask2;

        return iNo;
    }
    public static void main(String[] args) 
    {
        int No = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number :");
        No = sobj.nextInt();

        iRet = OFF7th10thBit(No);

        System.out.println("Updated number : " +iRet);
    }
    
}