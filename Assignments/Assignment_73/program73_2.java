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

    public void ReverseRows()
    {
        int i = 0;

        for(i = 0; i < iRow; i++)
        {
            int j = 0;
            int k = iCol - 1;
            int temp = 0;

            while(j < k)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i][k];
                Arr[i][k] = temp;

                j++;
                k--;
            }
        }
    }
}

class program73_2
{
    public static void main(String[] args) 
    {
        Matrix mobj = new Matrix(4,4);
        mobj.Accept();
        mobj.Display();

        mobj.ReverseRows();
        System.out.println("After Swappimg :");
        mobj.Display();
    }
}