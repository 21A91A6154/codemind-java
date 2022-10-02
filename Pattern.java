import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}