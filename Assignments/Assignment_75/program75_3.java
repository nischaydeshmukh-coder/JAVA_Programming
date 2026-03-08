import java.util.*;

class program74_3
{
    public static void main(String A[])
    {
        int AvailableStock = 0;

        Scanner sobj = new Scanner(System.in);
      
        System.out.println("Enter the Current Stock : ");
        int CurrentStock = sobj.nextInt();

        System.out.println("Request  Quantity : ");
        int RQuantity = sobj.nextInt();

        if(CurrentStock < 0 || RQuantity < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(RQuantity > CurrentStock)
        {
            System.out.println("Order Failed : Insufficient Stock.");
        }
        else
        {
            CurrentStock = CurrentStock - RQuantity;
            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock :"+CurrentStock);
        }

        if(CurrentStock < 5)
        {
            System.out.println("Low Stock Alert! ");
        }

        sobj.close();
    }
}