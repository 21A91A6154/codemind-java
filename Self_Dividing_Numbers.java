import java.util.Scanner;
class self
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int a,b,i,temp=0,c=0,d=0;
    a=sc.nextInt();
    b=sc.nextInt();
    for(i=a;i<=b;i++)
    {
        temp=i;
        while(temp!=0)
        {
            d=temp%10;
            if(d==0 || i%d!=0)
            {
                break;
            }
            temp=temp/10;
        }
        if(temp==0)
        {
            System.out.print(i+" ");
        }
    }
    }
}