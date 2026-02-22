import java.util.*;

class Matrix
{
    public int iRow ;
    public int iCol ;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }
    public void Accept()
    {
        int i =0 , j = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix ");

        for(i = 0; i < iRow ; i++)
        {
            System.out.println("Enter the elements of row : "+(i+1));

            for(j = 0 ; j < iCol ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        sobj.close();
    }

    public void Display()
    {
        int i =0 , j = 0; 

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow ; i++)
        {
            for(j = 0 ; j < iCol ; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int MaxDiagonal()
{
    int i = 0;
    int iMax = Arr[0][0];   // assume first diagonal element is max

    for(i = 0; i < iRow; i++)
    {
        // Primary Diagonal (i == j)
        if(Arr[i][i] > iMax)
        {
            iMax = Arr[i][i];
        }

        // Secondary Diagonal (i + j == n-1)
        if(Arr[i][iCol - i - 1] > iMax)
        {
            iMax = Arr[i][iCol - i - 1];
        }
    }

    return iMax;
}  
}

class program72_3
{
    public static void main(String[] args) 
    {
        int iRet = 0;
        Matrix mobj = new Matrix(4,4);
        mobj.Accept();
        mobj.Display();

        iRet = mobj.MaxDiagonal();
        System.out.println("Frequency of element is : " +iRet);
    }
}