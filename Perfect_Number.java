import java.util.Scanner;
class perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,sum=0;
    n=sc.nextInt();
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    if(n==sum)
    {
        System.out.print("True");
    }
    else
    {
       System.out.print("False");
    }
    }
}