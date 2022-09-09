import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,s;
        double area;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2;
        area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
        sc.close();
    }
}