///////////////////////////////////////////////////////////////
//
//  Function Name : printReverse
//  Description :   Reverse number upto n
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
 class Logic
 {
    void printReverse(int n)
    {
        for(int i = n ;i <= 1 ;i++)
        {
            System.out.println("Reverse numbers :" +i );
        }
    }
 }
 class Program20_2
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
 }