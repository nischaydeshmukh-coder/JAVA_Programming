import java.util.Scanner;
public class program64_2 
{
    public static void main(String args[])
    {
        int iNo = 0 , iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00020010;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("5th and 18th bit is ON");
        }
        else
        {
            System.out.println("5th and 18th bit is OFF");
        }

    }
}
