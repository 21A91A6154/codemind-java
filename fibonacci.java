import java.util.Scanner;
class fibinocci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=0,x=1;
        n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(x<n-1)
        {
            x+=1;
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        sc.close();
    }
}