//Input :  iRow = 4  iCol = 4
//Output :
//          A   B   C   D
//          a   b   c   d
//          A   B   C   D
//          a   b   c   d

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
        char ch;

        for(i = 1; i <= iRow; i++)
        {
            if(i % 2 == 0)
            {
                ch = 'a';
            }
            else
            {
                ch = 'A';
            }  
            for(j = 1; j <= iCol; j++,ch++)
            {
                System.out.print(ch+"\t");
            }  
            System.out.println();
        }  
    } 
}
class program28_2
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