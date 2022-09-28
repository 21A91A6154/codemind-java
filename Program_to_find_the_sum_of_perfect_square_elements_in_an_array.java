import java.util.Scanner;
class factor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,x=0,s=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            x=0;
            for(j=0;j<=a[i];j++)
            {
                if(j*j==a[i])
                {
                    x+=1;
                    break;
                }
            }
            if(x>0)
            {
                s=s+a[i];
            }
        }
        System.out.print(s);
    }
}