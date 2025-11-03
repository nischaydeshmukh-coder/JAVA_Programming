///////////////////////////////////////////////////////////////
//
//  Function Name : sumEvenNumbers
//  Description :   Addition of Even numbers upto n
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void sumEvenNumbers(int n)
    {
        int sum = 0;
        for(int i = 2; i <= n; i+=2)
        {
            sum=sum +i;
        }
        System.out.println("Sum of even Numbers" + n + "is" + sum);
    }
 }
 class Program20_1
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
 }