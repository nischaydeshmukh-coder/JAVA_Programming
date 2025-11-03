///////////////////////////////////////////////////////////////
//
//  Function Name : findSmallestDigit
//  Description :   Smallest Digit
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
 class Logic
{
void findSmallestDigit(int num)
{
    int Smallest = 9;
        while(num > 0)
        {
            int digit = num % 10;
            if(digit < Smallest)
            Smallest = digit;
            num =num / 10;
        }
        System.out.println("Smallest digit is:" + Smallest);
}
}
class Program20_5
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
 }