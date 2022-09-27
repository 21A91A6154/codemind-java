import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int a,b,i,temp,d,sum=0;
    a=sc.nextInt();
    b=sc.nextInt();
	if(a<b)
	{
    for(i=a;i<=b;i++)
    {
        temp=i;
        sum=0;
        while(temp!=0)
        {
            d=temp%10;
            temp=temp/10;
            sum=sum*10+d;
        }
        if(i==sum)
        {
            System.out.print(i+" ");
    }
    }
}
}
}