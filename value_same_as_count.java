import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,v=0,c=0,x=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        b[0]=a[0];
        v+=1;
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<v;j++)
            {
                if(a[i]==b[j])
                {
                    c+=1;
                }
            }
            if(c==0)
            {
                b[v]=a[i];
                v+=1;
            }
        }
        for(i=0;i<v;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                    c+=1;
                }
            }
           if(c==b[i])
           {
               x+=1;
           }
        }
        System.out.print(x);
    }
}