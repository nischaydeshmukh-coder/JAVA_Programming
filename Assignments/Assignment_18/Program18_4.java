 ///////////////////////////////////////////////////////////////
//
//  Function Name : sumEvenOddDigits
//  Description :   Addition of Even and Odd Numbers seperately
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
 class Logic
 {
    void sumEvenOddDigits(int num)
    {
        int evenSum = 0, oddSum = 0;
        while(num !=0)
        { 
            int digit =num %10;
            if(digit % 2== 0)
                evenSum =evenSum +digit;
            else    
                oddSum =oddSum +digit;
            num = num / 10;
        }
        System.out.println("Sum of Even numbers  " +evenSum);
        System.out.println("Sum of Odd numbers  " +oddSum);
    }
 }
 class Program18_4
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
 }
 