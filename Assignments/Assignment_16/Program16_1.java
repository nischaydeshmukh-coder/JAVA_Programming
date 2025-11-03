////////////////////////////////////////////////////////////////
//
//  Function Name : calculateSum
//  Description :   Sum of first n Natural Numbers        
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
//
/////////////////////////////////////////////////////////////////
class Logic
 {
    void calculateSum(int n)
    {
        int Sum = 0;
        for(int i = 1; i <= n; i++)
        {
            Sum= Sum + i;
        }
        System.out.println("Sum of First n Natural numbers:"+Sum);
    }
 }
 class Program16_1
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
 }