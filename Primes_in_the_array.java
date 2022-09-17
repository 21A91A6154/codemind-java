import java.util.Scanner;
class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,c=0,x=0,j;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            c=0;
            for(j=2;j<=(int)Math.sqrt(a);j++)
            {
                if(a%j==0)
                {
                    c+=1;
                }
            }
            if(c==0)
            {
                if(a!=1)
                {
                    x+=1;
                }
            }
        }
        System.out.print(x);
        sc.close();
    }
}