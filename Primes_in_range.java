import java.util.Scanner;
class primes_range
{
            
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
                        int a,b,i,j,c=0,m=0;
                        a=sc.nextInt();
                        b=sc.nextInt();
                        for(i=a;i<=b;i++)
                        {
                            c=0;
                            for(j=2;j<=(int)Math.sqrt(i);j++)
                            {
                                     if(i%j==0)
                                     {
                                            c+=1;
                                     }
                            }
                            if(c==0)
                            {
                                if(i!=1)
                                {
                                m+=1;
                                }
                            }
                        }
                        System.out.print(m);
                        sc.close();
	}
}