import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
               System.out.print(" ");
            }
            for(j=i-1;j>=1;j--)
            {
               System.out.print(j);
            }
            System.out.print("0");
            for(j=1;j<=i-1;j++)
            {
               System.out.print(j);
            }
            System.out.println();
        }
    }
}