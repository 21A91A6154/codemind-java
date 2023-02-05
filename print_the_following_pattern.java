import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,k=1;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=k;j++)
            {
                System.out.print(i);
            }
            k=k+2;
            System.out.println();
        }
    }
}