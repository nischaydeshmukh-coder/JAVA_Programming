import java.util.Scanner;

public class program65_4
{
    public static int Toggel7th10thBit(int iNo)
    {
        int iMask = 0, iMask1 = 0, iMask2 = 0;
        iMask1 = 0x00000040;
        iMask2 = 0x00000200;

        iMask = iMask1 | iMask2;

        iNo = iNo ^ iMask;

        return iNo;
    }
    public static void main(String[] args) 
    {
        int No = 0 ,iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        No = sobj.nextInt();

        iRet = Toggel7th10thBit(No);

        System.out.println("Updated number : "+iRet);
    }   
}