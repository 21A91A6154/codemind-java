import java.util.Scanner;
class sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}