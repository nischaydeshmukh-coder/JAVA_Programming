import java.util.*;

class program76_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String PeakHours = null;

        System.out.println("Enter the Distance :");
        int Distance = sobj.nextInt();
        
        System.out.println("Enter Peak Hours (Yes / NO) :");
        PeakHours = sobj.next();

        if(Distance < 0 && 
            (PeakHours.equalsIgnoreCase("Yes") == false) && 
            (PeakHours.equalsIgnoreCase("No") == false))
        {
            System.out.println("Invalid Input ");
            return;
        }

        float Fare = 50f;

        if(Distance <= 10)
        {
            Fare = Fare + (Distance * 12); 
        }
        else 
        {
            Fare = Fare + (10 * 12) + ((Distance - 10) * 15);
        }
    
        if(PeakHours.equalsIgnoreCase("Yes"))
        {
            Fare = Fare + (Fare * 0.20f); 
        }

        System.out.println("Distance : " +Distance);
        System.out.println("Peak Hour : " +PeakHours);
        System.out.println("Total Fare : "+Fare);
        

    }
    
}
