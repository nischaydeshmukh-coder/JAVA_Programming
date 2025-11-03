///////////////////////////////////////////////////////////////
//
//  Function Name : countFactors
//  Description :   Count of factors
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          03/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void countFactors(int num)
    {
        
        int fcount = 0;
        for(int i =1; i<= num; i++)
        {
            if(num % i == 0)
            {
                fcount++;
                
            }
        }
        System.out.println("Total number of factors of"+num + "are"+fcount);
    }
 }
 class Program21_4
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
 }