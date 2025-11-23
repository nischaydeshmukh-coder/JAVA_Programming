//Input :  iRow = 5  iCol = 5
//Output :
//          1   2   3   4    
//          2   3   4   5
//          3   4   5   6 
//          4   5   6   7

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
        int iNo = 1;
    
        for(i = 1; i <= iRow; i++)
        {  
            for(j = 1,iNo = i;j <= iCol; j++,iNo++)
            {
                System.out.print(iNo+"\t"); 
            }
            System.out.println();
        }  
    } 
}
class program29_5
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