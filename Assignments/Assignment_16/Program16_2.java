 ////////////////////////////////////////////////////////////////
//
//  Function Name : checkEvenOdd
//  Description :   Check the given Numbers is even or odd       
//  Input :         Integer 
//  Output :        Character
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
//
/////////////////////////////////////////////////////////////////
 class Logic
 {
    void checkEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
 }
 class Program16_2
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
 }