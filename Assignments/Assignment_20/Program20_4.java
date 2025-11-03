///////////////////////////////////////////////////////////////
//
//  Function Name : findLargestDigit
//  Description :   Largest Digit
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
 class Logic
 {
    void findLargestDigit(int num)
    {
        int Largest = 0;
        while(num > 0)
        {
            int digit = num % 10;
            if(digit > Largest)
            Largest = digit;
            num =num / 10;
        }
        System.out.println("Laargest digit is:" + Largest);
    }
 }
 class Program20_4
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
 }