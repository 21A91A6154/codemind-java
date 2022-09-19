import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c+=1;
            }
            if(c>0)
            {
                break;
            }
        }
        if(c>0)
        {
            System.out.print("not a prime");
        }
        else
        {
            System.out.print("prime");
        }
        sc.close();
	}
}