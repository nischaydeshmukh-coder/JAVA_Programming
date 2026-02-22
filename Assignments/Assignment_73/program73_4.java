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

    public boolean isIdentityMatrix()
    {
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                // Check diagonal elements
                if(i == j)
                {
                    if(Arr[i][j] != 1)
                    {
                        return false;
                    }
                }
                // Check non-diagonal elements
                else
                {
                    if(Arr[i][j] != 0)
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

class program73_4
{
    public static void main(String[] args) 
    {
        boolean bRet ;

        Matrix mobj = new Matrix(4,4);
        mobj.Accept();
        mobj.Display();

        bRet = mobj.isIdentityMatrix();
        if(bRet == true)
        {
            System.out.println("Matrix is a Identity Matrix ");
        }
        else
        {
            System.out.println("Matrix is not a Identity Matrix ");
        }
    }
}