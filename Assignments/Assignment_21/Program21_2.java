///////////////////////////////////////////////////////////////
//
//  Function Name : countEvenOddRange
//  Description :   Count of even and odd numbers
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          03/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void countEvenOddRange(int n)
    {
        int evencount = 0, oddcount =0 ;
         
        for(int i =1; i <= n; i++)
        {
            if(i % 2 == 0)
            evencount ++;
            else
            oddcount++;
        }
        System.out.println("Even Numbers:" +evencount);
        System.out.println("Odd Numbers" +oddcount);
    }
 }
 class Program21_2
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
 }