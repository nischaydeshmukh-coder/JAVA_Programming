//Input :  iRow = 5  iCol = 5
//Output :
//          a   b   c   d   e
//          1   2   3   4   5  
//          a   b   c   d   e
//          1   2   3   4   5
//          a   b   c   d   e 

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
        char ch='a';
        int iNo = 1;
    
        for(i = 1; i <= iRow; i++)
        {  
            for(j = 1,ch = 'a',iNo = 1;j <= iCol; j++,iNo++)
            {
                if(i % 2 == 0 )
                {
                    System.out.print(iNo+"\t");  
                }
                else
                {
                    System.out.print(ch+"\t");
                    ch++;
                } 
            }
            System.out.println();
        }  
    } 
}
class program29_3
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