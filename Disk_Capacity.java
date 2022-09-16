import java.util.Scanner;
class drop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        System.out.print(2*t*s*b*512);
    }
}