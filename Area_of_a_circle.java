import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float r;
        double a;
        r=sc.nextFloat();
        a=(float)3.14*r*r;
        System.out.format("%.2f",a);
        sc.close();
    }
}