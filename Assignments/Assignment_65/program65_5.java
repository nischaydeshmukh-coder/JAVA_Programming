import java.util.Scanner;

public class program65_5
{
    public static int ONFirst4Bit(int iNo)
    {
        int iMask = 0;

        iMask = 0x00000004;

        iNo = iNo | iMask;

        return iNo;
    }
    public static void main(String[] args) 
    {
        int No = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number :");
        No = sobj.nextInt();

        iRet = ONFirst4Bit(No);

        System.out.println("Updated number : " + iRet);
    }   
}
