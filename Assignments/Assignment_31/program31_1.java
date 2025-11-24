//Input :  iRow = 5  iCol = 5
//Output :
//          *   
//          *   *
//          *   *   *
//          *   *   *   *
//          *   *   *   *   *

/////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description :   Display the given pattern.
//  Input :         int,int
//  Output :        pattern
//  Auther :        Nischay Hemant Deshmukh
//  Date :          23/11/2025
//
/////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern 
{
    public void Display(int iRow, int iCol)
    { 
        int i = 0, j = 0;
        
        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Row Number and Column number should be same");
            return;
        }
        for(i = 1; i <= iRow; i++)
        {  
            for(j = 1;j <= iCol; j++)
            {
                if(i >= j )
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }  
    } 
}
class program31_1
{
    public static void main(String[] args) 
    { 
        int iValue1 = 0, iValue2 = 0; 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Rows:"); 
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Cols:"); 
        iValue2 = sobj.nextInt();
    
        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2); 
    
         
    } 
}