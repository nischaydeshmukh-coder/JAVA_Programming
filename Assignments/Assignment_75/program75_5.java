import java.util.*;

class program74_5 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        long AnnualIncome = 0;
        double Tax = 0;

        System.out.println("Enter Annual Income :");
        AnnualIncome = sobj.nextLong();

        if(AnnualIncome < 0)
        {
            System.out.println("Invalid Input ");
            return;
        }

        if(AnnualIncome <=  250000)
        {
            Tax = AnnualIncome * 0.0;
        }
        else if(AnnualIncome <= 500000)
        {
            Tax = ((AnnualIncome - 250000) * 0.05);
        }
        else if(AnnualIncome >= 500001 && AnnualIncome <= 1000000)
        {
            Tax = (250000 * 0.05) + (AnnualIncome - 500000) * 0.20;
        }
        else if(AnnualIncome > 1000000 )
        {
            Tax = (250000 * 0.05) + (500000 * 0.20) + 
            ((AnnualIncome - 1000000) * 0.30);
        }

        System.out.println("Annual Income : "+AnnualIncome);
        System.out.println("Total Tax Payable : "+Tax);
    }    
}
