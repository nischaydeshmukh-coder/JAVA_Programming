import java.util.Scanner;
public class program64_5
{
    public static void main(String args[])
    {
        long iNo = 0 , iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextLong();

        iMask = 0x80000001L;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("1st and 32nd bit is ON");
        }
        else
        {
            System.out.println("1st and 32nd bit is OFF");
        }

    }
}
