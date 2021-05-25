import java.util.Scanner;

class multiply
{
    void mul(int ar1[][] , int ar2[][], int r1,int c2,int c1)
    {
        int[][] ar3 = new int[r1][];
        int i,j,k;
        for(i=0;i<r1;i++) 
            {
                ar3[i] = new int[c2];
                for(j=0;j<c2;j++) 
                {
                    for(k=0;k<c1;k++) 
                    {
                        ar3[i][j] += ar1[i][k] * ar2[k][j];
                    }
                }
            }
    
        System.out.println("\nResultant matrix : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(ar3[i][j]+" ");
            }
            System.out.println();
        }
    }
       
    
}
class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r1,r2,c1,c2,i,j;
        System.out.print("Enter the number of rows and columns of first matrix : ");
        r1 = scan.nextInt();
        c1 = scan.nextInt();
        System.out.print("Enter the number of rows and columns of second matrix : ");
        r2 = scan.nextInt();
        c2 = scan.nextInt();
        
        if(c1 != r2)
        {
            System.out.println("Multiplication of these 2 matrices is not possible");
        }
        else
        {
            int[][] a1 = new int[r1][];
            int[][] a2 = new int[r2][];
            try
            {
                System.out.println("Enter the first matrix elements : ");
                for(i=0;i<r1;i++)
                {
                    a1[i] = new int[c1];
                    for(j=0;j<c1;j++)
                    {
                        a1[i][j] = scan.nextInt();
                    }
                }
                System.out.println("Enter the second matrix elements : ");
                for(i=0;i<r2;i++)
                {
                    a2[i] = new int[c2];
                    for(j=0;j<c2;j++)
                    {
                        a2[i][j] = scan.nextInt();
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index out of range");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            multiply m = new multiply();
            m.mul(a1,a2,r1,c2,c1);
            
        }
        
    }
}

