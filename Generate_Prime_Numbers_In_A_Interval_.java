import java.util.Scanner;
class generate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int m,n,i,j,count=0,c=0;
    n=sc.nextInt();
    m=sc.nextInt();
    if(n==1)
    n=2;
    for(i=n;i<=m;i++)
    {
        count=0;
        for(j=2;j<=(int)Math.sqrt(i);j++)
        {
            if(i%j==0)
            {
               count++;
            }
        }
        if(count==0)
        {
            System.out.println(i);
        }
    }
    }
}