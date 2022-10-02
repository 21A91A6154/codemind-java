import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,l;
        n=sc.nextInt();
        k=65+n-1;
        l=n;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=l;j++)
            {
                System.out.print((char)k+" ");
            }
            l--;
            k--;
            System.out.println();
        }
    }
}