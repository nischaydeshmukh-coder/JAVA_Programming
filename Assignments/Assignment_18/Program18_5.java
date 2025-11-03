 ///////////////////////////////////////////////////////////////
//
//  Function Name : checkSign
//  Description :   Number is Postive ,Negative or Zero
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void checkSign(int num)
    {
        if(num > 0)
        {
            System.out.println(num+"is positive");
        }
        else if(num <0)
        {
            System.out.println(num+"is negative");
        }
        else
        {
            System.out.println(num+"is Zero ");
        }
    }
 }
 class Program18_5
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(8);
    }
 }