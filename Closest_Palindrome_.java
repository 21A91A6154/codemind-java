import java.util.Scanner;
class palindrome
{
    public static void main(String rags[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,rev=0,s=0,q=0,k,d;
    n=sc.nextInt();
    for(i=n+1;i<2*n;i++)
    {
        k=i;
        rev=0;
        while(k!=0)
        {
            d=k%10;
            k=k/10;
            rev=rev*10+d;
        }
        if(i==rev)
        {
            s=i;
            break;
        }
    }
    for(i=n-1;i>=0;i--)
    {
        k=i;
        rev=0;
        while(k!=0)
        {
            d=k%10;
            k=k/10;
            rev=rev*10+d;
        }
        if(i==rev)
        {
            q=i;
            break;
        }
    }
    if(s-n<n-q)
    {
        System.out.print(s);
    }
    else if(n-q<s-n)
    {
       System.out.print(q);
    }
    else
    {
        System.out.print(q+" ");
        System.out.print(s);
    }
    }
}