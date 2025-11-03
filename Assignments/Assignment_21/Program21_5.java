///////////////////////////////////////////////////////////////
//
//  Function Name : printDivisibleBy2and3
//  Description :   Numbers divisible by 2 and 3
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          03/11/2025
//////////////////////////////////////////////////////////////////
class Logic
 {
    void printDivisibleBy2and3(int n)
    {
        System.out.println("Numbers divisible by both 2 and 3 ut to" + n );

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }
 }
 class Program21_5
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
 }