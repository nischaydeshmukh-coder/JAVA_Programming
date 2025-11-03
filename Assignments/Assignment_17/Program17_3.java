 ////////////////////////////////////////////////////////////////
//
//  Function Name : findMax
//  Description :   Maximum of Number of two numbers
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
//
/////////////////////////////////////////////////////////////////
class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a + "is Maximum");
        }
        else
        {
        System.out.println(b + " is Maximum");
        }
    }
}
 class Program17_3
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
 }