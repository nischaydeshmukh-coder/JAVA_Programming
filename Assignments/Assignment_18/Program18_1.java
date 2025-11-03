///////////////////////////////////////////////////////////////
//
//  Function Name : checkPrime
//  Description :   Prime Numbers
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void checkPrime(int num)
    {
        if(num < 0)
        {
            System.out.println(num +" is not prime number");
        }

        boolean isPrime = true;
        for(int i = 2; i <= num ;i++)
        {
            if(num % i == 0 )
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num +" is not prime number");
        } 
        else
        {
            System.out.println(num +" is prime number");
        }
    }
 }
 class Program18_1
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
 }

