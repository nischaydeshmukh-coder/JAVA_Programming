//Input :  iRow = 4  iCol = 4
//Output :
//          4   4   4   4
//          3   3   3   3
//          2   2   2   2
//          1   1   1   1

/////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description :   Display the given pattern.
//  Input :         int,int
//  Output :        pattern
//  Auther :        Nischay Hemant Deshmukh
//  Date :          22/11/2025
//
/////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern 
{
    public void Display(int iRow, int iCol)
    { 
        int i = 0, j = 0;

        for(i = iRow; i >= 1; i--)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }  
            System.out.println();
        }  
    } 
}
class program28_4
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