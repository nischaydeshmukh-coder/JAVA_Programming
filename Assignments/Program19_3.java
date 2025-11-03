///////////////////////////////////////////////////////////////
//
//  Function Name : checkDivisible
//  Description :   Number is divisible by 5 and 11 or not
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void checkDivisible(int num)
    {
        if(num % 5 ==0 && num % 11 == 0)
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
 }
 class Program19_3
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
 }