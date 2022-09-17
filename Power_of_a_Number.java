import java.util.Scanner;
class power
{
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
        int x,y,m,p=0,mo=0;
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        p=(int)Math.pow(x,y);
        mo=p%m;
        System.out.println(mo);
        sc.close();
	}
}