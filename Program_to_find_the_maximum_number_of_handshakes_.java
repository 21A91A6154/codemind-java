import java.util.Scanner;
class average
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        int a,n;
        a=sc.nextInt();
        n=a*(a-1)/2;
        System.out.print(n);
        sc.close();
    }
}