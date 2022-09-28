import java.util.Scanner;
class primes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,v=0,z=0,s=0;
        n=sc.nextInt();
        int l[]=new int[n];
        int r[]=new int[2*n];
        for(i=2;i<n+1;i++)
        {
            c=0;
            for(j=1;j<i+1;j++)
            {
                if(i%j==0)
                {
                    c+=1;
                }
            }
            if(c==2)
            {
               l[v]=i;
               v+=1;
            }
        }
        for(i=0;i<v;i++)
        {
            for(j=0;j<v;j++)
            {
                if(l[i]!=l[j])
                {
                    if(l[i]*l[j]==n)
                    {
                       r[s]=l[i];
                       s+=1;
                       r[s]=l[j];
                       s+=1;
                    }
                }
            }
        }
        if(s==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(r[0]+" ");
            System.out.print(r[1]);
        }
    }
}