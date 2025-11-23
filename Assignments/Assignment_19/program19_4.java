
///////////////////////////////////////////////////////////////
//
//  Function Name : printDigits
//  Description :   Print ecah digit seperetely
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void printDigits(int num)
    {
        System.out.println("Digits of "+ num +" are ");
        int rev = 0;
        int temp = num;

        while(temp > 0)
        {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        while (rev > 0)
        { 
            System.out.println(rev % 10);
            rev = rev / 10;   
        }
    }
 }
 class program19_4
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
 }
