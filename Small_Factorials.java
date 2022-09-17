import java.util.Scanner;
class factorial
{
    public static int findfact(int n)
    {
        int fact=1,i;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
        int n,res,t,i;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            n=sc.nextInt();
            res=findfact(n);
            System.out.println(res);
        }
        sc.close();
	}
}