import java.util.*;

class program74_4 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;
        String Helmet = null;
        String Licence = null;
        String OverSpeeding = null;

        System.out.println("Helmet Worn:(Yes / No)");
        Helmet = sobj.next();

        System.out.println("Licence :(Yes / No)");
        Licence = sobj.next();

        System.out.println("OverSpeeding :(Yes / No)");
        OverSpeeding = sobj.next();

        if((Helmet.equalsIgnoreCase("Yes") == false) && 
            (Helmet.equalsIgnoreCase("No") == false) ||
            (Licence.equalsIgnoreCase("Yes") == false) &&
            (Licence.equalsIgnoreCase("No") == false) ||
            (OverSpeeding.equalsIgnoreCase("Yes") == false) &&
            (OverSpeeding.equalsIgnoreCase("No") == false)
        )
        {   
            System.out.println("Invalid Input ");
            return;
        }

        if(Helmet.equalsIgnoreCase("No"))
        {
            Amount = Amount + 500;
        }

        if(Licence.equalsIgnoreCase("No"))
        {
            Amount =  Amount + 1000;
        }

        if(OverSpeeding.equalsIgnoreCase("No"))
        {
            Amount = Amount + 1500;
        }

        System.out.println("Total Final Amount :"+Amount);

        sobj.close();

    }    
}
