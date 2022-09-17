import java.util.Scanner;
class power
{
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
        int x,i,c=0,t,k;
        t=sc.nextInt();
        for(k=0;k<t;k++)
        {
            c=0;
            x=sc.nextInt();
            for(i=1;i<=x/2;i++)
            {
                if(i*i==x)
                {
                    System.out.println("True");
                    c+=1;
                    break;
                    
                }
            }
            if(c==0)
            {
                System.out.println("False");
            }
        }
        sc.close();
	}
}