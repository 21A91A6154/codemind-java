import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        if(n<3 || n>100)
        {
            System.out.print("The pattern is not possible");
        }
        else
        {
            for(i=1;i<n;i++)
            {
                for(j=i;j>=1;j--)
                {
                    System.out.print("*");
                }
            System.out.println();
            }
            for(i=1;i<=n;i++)
            {
                for(j=i;j<=n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}