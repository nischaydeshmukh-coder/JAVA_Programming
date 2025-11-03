////////////////////////////////////////////////////////////////
//
//  Function Name : countDigits
//  Description :   Count the Number of digits     
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
//
/////////////////////////////////////////////////////////////////
class Logic
 {
    void countDigits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            count++;
            num = num /10;
        }
        System.out.println("Number of digits" +count);
    }
 }
 class Program16_5
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
 }