import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-2;j++)
            {
               System.out.print(j);
            }
            for(j=n-3;j>=1;j--)
            {
              System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}

