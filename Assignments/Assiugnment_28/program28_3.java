//Input :  iRow = 3  iCol = 5
//Output :
//          A   A   A   A   A
//          B   B   B   B   B
//          C   C   C   C   C

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
        char ch = 'A';

        for(i = 1; i <= iRow; i++)
        {
              
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
            }  
            ch++;
            System.out.println();
        }  
    } 
}
class program28_3
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