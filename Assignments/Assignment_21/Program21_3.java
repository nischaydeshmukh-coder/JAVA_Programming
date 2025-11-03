///////////////////////////////////////////////////////////////
//
//  Function Name : displayFactors
//  Description :   Factor
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          03/11/2025
///////////////////////////////////////////////////////////////////
class Logic
{
    void displayFactors(int num)
    {
        System.out.println("factors of " + num + "are");

        for(int i =1; i<= num; i++)
        {
            if(num % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
class Program21_3
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
 }