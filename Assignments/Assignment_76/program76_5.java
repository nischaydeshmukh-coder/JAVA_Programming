import java.util.*;

class program76_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Status = null;

        System.out.println("Enter Battery Amount :");
        int BPercentage = sobj.nextInt();

        if(BPercentage < 0 || BPercentage > 100)
        {
            System.out.println("Invalid Input ");
            return;
        }

        if(BPercentage <= 5)
        {
            Status = "Critical";
        }
        else if(BPercentage <= 15)
        {
            Status = "Low";
        }
        else
        {
            Status = "Normal";
        }
        
        System.out.println("Battery Percentage : "+BPercentage);
        System.out.println("Status : "+Status);
    }    
}
