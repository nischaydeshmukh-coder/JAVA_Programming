//Input :  iRow = 4  iCol = 5
//Output :
//          2   4   6   8   10
//          1   3   5   7   9  
//          2   4   6   8   10
//          1   3   5   7   9 

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
    
        for(i = 1; i <= iRow; i++)
        {  
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 == 0 )
                {
                    System.out.print(((2*j)-1)+"\t");
                }
                else
                {
                    System.out.print((2*j) +"\t");
                } 
            }
            System.out.println();
        }  
    } 
}
class program29_2
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