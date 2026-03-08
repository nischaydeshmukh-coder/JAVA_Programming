import java.util.*;

class program74_1
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        int Amount = 0;

        System.out.println("Enter total parking Hours : ");
        int Hours = sobj.nextInt();

        if(Hours <= 2)
        {
            Amount = 20;
        }
        else if(Hours > 2 && Hours <= 10)
        {
            Amount = 20 + ((Hours - 2) * 10);
        }
        else if(Hours > 10)
        {
            Amount = 20 + (8 * 10) + 50;
        }

        System.out.println("Total Parking Duration : "+Hours);
        System.out.println("Total Parking Fee : "+Amount);
        
    }
}