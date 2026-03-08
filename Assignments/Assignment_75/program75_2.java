import java.util.*;

class program74_2
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
      
        String Eloan = null;

        System.out.println("Enter the Age : ");
        int Age = sobj.nextInt();

        System.out.println("Enter the Monthly Income : ");
        int Mincome = sobj.nextInt();

        System.out.println("Enter the Credit Score : ");
        int CreditScore = sobj.nextInt();

        System.out.println("Enter any existing loan (Yes / No) : ");
        Eloan = sobj.next();

        if(Age < 0 || Mincome < 0 ||  CreditScore < 0 || 
            (Eloan.equalsIgnoreCase("Yes") == false) &&
            (Eloan.equalsIgnoreCase("No") == false)
           )
        {
            System.out.println("Invalid Input ");
            return;
        }

        if((Age >= 21 && Age <= 60) && Mincome >= 25000 && CreditScore >=700 && 
            (Eloan.equalsIgnoreCase("No")) 
           )
        {
            System.out.println("Loan Approved");
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Age Limit not satisfied.");
        }

        if(Mincome < 25000)
        {
            System.out.println("Loan Rejected : Mimimum Income Limit not satisfied.");
        }

        if(CreditScore < 700)
        {
            System.out.println("Loan Rejected : Credit Score Limit not satisfied.");
        }
        
        if(Eloan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected : You have an Existing Loan.");
        }
        
    }
}