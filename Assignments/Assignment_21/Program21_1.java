///////////////////////////////////////////////////////////////
//
//  Function Name : productOfDigits
//  Description :   Product of Digit
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          03/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void productOfDigits(int num)
    {
        int Product = 1;
        int digit = 0;

        while(num != 0)
        {
            digit = num % 10;
            Product = Product * digit;
            num = num /10 ;
        }
        System.out.println("Product of digit is :" +Product);
    }
 }
 class Program21_1
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
 }