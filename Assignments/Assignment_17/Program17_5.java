 ////////////////////////////////////////////////////////////////
//
//  Function Name : printTable
//  Description :   Multiplication Table
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
//
/////////////////////////////////////////////////////////////////
 class Logic
 {
    void printTable(int num)
    {
        System.out.println( "Multiplication Table"+num );
        for(int i =1; i<= 10; i++)
        {
            System.out.println(+(num * i));
        }
    }
 }
 class Program17_5
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
 }