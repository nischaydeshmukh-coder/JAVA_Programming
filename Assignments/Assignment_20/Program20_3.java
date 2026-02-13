///////////////////////////////////////////////////////////////
//
//  Function Name : checkPerfect
//  Description :   Number is perfect or not
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
class Logic
{
    void checkPerfect(int num)
    {
        int sum = 0;
        for(int i = 1; i<= num/ 2; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == num )
        {
        System.out.println(num +"is a perfect Number");
        }
        else
        {
           System.out.println(num +"is not a perfect Number"); 
        }
    }
}
class Program20_3
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }

 }
