import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,c=0,k=0;
        n=sc.nextInt();
        m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        for(j=0;j<m;j++)
        {
           b[j]=sc.nextInt();
        }
       for(i=0;i<n;i++)
       {
           c=0;
           for(j=0;j<m;j++)
           {
              if(a[i]!=b[j])
              {
                 c++;
              }
            }
            if(c==m)
            {
                System.out.print(a[i]+" ");
            }
        }
        for(j=0;j<m;j++)
        {
            k=0;
            for(i=0;i<n;i++)
            {
               if(b[j]!=a[i])
               {
                   k++;
               }
            }
            if(k==n)
            {
               System.out.print(b[j]+" ");
            }
        }
    }
}