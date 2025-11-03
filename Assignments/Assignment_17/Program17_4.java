 ////////////////////////////////////////////////////////////////
//
//  Function Name : findMin
//  Description :   Minimum of Number of three numbers
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
//
/////////////////////////////////////////////////////////////////
 class Logic
 {
    void findMin(int a, int b, int c)
    {
        if(a < b && a < c)
        {
            System.out.println(a +"is Minimum");
        }
        if(b < a && b < c)
        {
            System.out.println(b +"is Minimum");
        }
        if(c < a && c < b)  
        {
            System.out.println(c +"is Minimum");
        }
    }
 }
 class Program17_4
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(2 ,3 ,7);
    }
 }