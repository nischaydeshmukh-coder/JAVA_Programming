
///////////////////////////////////////////////////////////////
//
//  Function Name : displayGrade
//  Description :   Grade of a student
//  Input :         Integer 
//  Output :        Integer
//  Author :        Nischay Hemant Deshmukh
//  Date :          02/11/2025
///////////////////////////////////////////////////////////////////
class Logic
 {
    void displayGrade(int marks)
    {
        if(marks >= 90)
        {
            System.out.println("Grade A+");
        }
        else if(marks >= 75)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade C");
        }
        else if(marks >= 35)
        {
            System.out.println("Grade D");
        }
        else 
        {
            System.out.println("Grade Fail");
        }
    }
 }
 class program19_2
 {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
 }
