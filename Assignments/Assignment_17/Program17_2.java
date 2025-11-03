 ////////////////////////////////////////////////////////////////
//
//  Function Name : checkPalindrome
//  Description :   Number is Palindrome or not
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
//
/////////////////////////////////////////////////////////////////
 class Logic
 {
    void checkPalindrome(int num)
    {
        int rev =0;
        int original = num;

        while(num != 0)
        {
            int digit =num %10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(original == rev)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not Palindrome");

        }
    }
 }
 class Program17_2
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
 }