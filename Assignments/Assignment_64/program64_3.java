import java.util.Scanner;
public class program64_3
{
    public static void main(String args[])
    {
        int iNo = 0 , iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x08104040;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th ,15th ,21st and 28th bit is ON");
        }
        else
        {
            System.out.println("7th ,15th ,21st and 28th bit is OFF");
        }

    }
}
