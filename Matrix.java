import java.util.Scanner;
class Matrix
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix: ");
        int n = sc.nextInt();

        System.out.println("Enter the number of columns in matrix : ");
        int m = sc.nextInt();

        int i,j;

        int [][] a = new int[n][m];
        int b[][]   = new int[n][m];
        int c[][]=new int[n][m];
        System.out.println("Enter the elements in the first matrix : ");

        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the elements in the second matrix : "); 

        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
         
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                c[i][j] = a[i][j] +b[i][j] ;
            }
        }

        System.out.println(" Resultant Matrix: ");     
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }



        }


    }

