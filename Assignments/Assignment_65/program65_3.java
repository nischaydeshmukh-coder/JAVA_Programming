import java.util.Scanner;

public class program65_3
{
    public static int Toggel7thBit(int iNo)
    {
        int iMask = 0;

        iMask = 0x00000040;

        iNo = iNo ^ iMask;

        return iNo;
    }    
    public static void main(String[] args) 
    {
        int No = 0 , iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        No = sobj.nextInt();

        iRet = Toggel7thBit(No);

        System.out.println("Updated number : "+iRet);
    }  
}
    