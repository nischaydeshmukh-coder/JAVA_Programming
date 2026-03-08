import java.util.*;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Budget Amount :");
        int BAmount = sobj.nextInt();

        System.out.println("Enter Number of Items :");
        int N = sobj.nextInt();

        if(BAmount < 0 || N < 0 )
        {
            System.out.println("Invalid Input ");
            return;
        }

        int Prices[] = new int[N];

        System.out.println("Enter Item Prices :");
        for(int i = 0; i < N ;i++)
        {
            Prices[i] = sobj.nextInt();

            if(Prices[i] <= 0)
            {
                System.out.println("Invalid Input ");
                return;
            }
        }

        int count = 0;

        for(int i = 0; i < N ; i++)
        {
            if(BAmount >= Prices[i])
            {
                BAmount = BAmount - Prices[i];
                count++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Item Purchased : "+count);
        System.out.println("Remaining Balance : "+BAmount);
    }    
}
