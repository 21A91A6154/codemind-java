import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,l;
        n=sc.nextInt();
        k=n;
        for(i=1;i<=n;i++)
        {
            l=i;
            for(j=1;j<=k;j++)
            {
                System.out.print(l+" ");
                l++;
            }
            k--;
            System.out.println();
        }
    }
}