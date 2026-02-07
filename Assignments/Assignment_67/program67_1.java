import java.util.Scanner;

class program67_1
{
    public static int CountBits(int iNo)
    {
        int iCount = 0;

        while (iNo != 0)
        {
            if ((iNo & 1) == 1)
            {
                iCount++;
            }
            iNo = iNo >> 1;
        }

        return iCount;
    }

    public static void main(String args[])
    {
        int iNo = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = CountBits(iNo);

        System.out.println("Number of ON bits : " + iRet);
    }
}
