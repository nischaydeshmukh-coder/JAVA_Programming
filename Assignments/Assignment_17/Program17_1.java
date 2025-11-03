 ////////////////////////////////////////////////////////////////
//
//  Function Name : sumOfDigits
//  Description :   Addition of all Numners     
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
//
/////////////////////////////////////////////////////////////////
 class Logic
 {
    void sumOfDigits(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            int digit =num %10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Number of digits" +sum);
    }
 }
 class Program17_1
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
 }