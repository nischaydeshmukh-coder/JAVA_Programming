import java.util.*;

class program76_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Charges = 50;

        System.out.println("Parcel Weight :");
        int Weight = sobj.nextInt();

        if(Weight < 0)
        {
            System.out.println("Invalid Input ");
            return;
        }

        if(Weight <= 5)
        {
            Charges = Charges + ((Weight - 1) * 20 );
        }
        else if(Weight > 5)
        {
            Charges = 130 + ((Weight - 5) * 30 );
        }

        System.out.println("Parcel Weight : "+Weight);
        System.out.println("Courier Charges : "+Charges);
    }    
}
