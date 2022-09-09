import java.util.Scanner;
class average
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        float c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=a*b;
        System.out.format("%.2f",c);
        sc.close();
    }
}