///////////////////////////////////////////////////////////////
//
//  Function Name : CheckLeapYear
//  Description :   Check the year is leap year or not
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////

class Logic
 {
    void CheckLeapYear(int year)
    {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
        {
            System.out.println(year + " is a leap year.");
        }
        else 
        {
            System.out.println(year + " is not a leap year.");
        }
    }
 }
 class program19_1
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2024);
    }
 }