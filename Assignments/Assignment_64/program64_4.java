import java.util.Scanner;
public class program64_4
{
    public static void main(String args[])
    {
        int iNo = 0 , iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = (1<<6) | (1<<7) | (1<<8);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th ,8th and 9th bit is ON");
        }
        else
        {
            System.out.println("7th ,8th and 9th bit is OFF");
        }

    }
}
