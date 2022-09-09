import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c;
        float f;
        c=sc.nextFloat();
        f=32+(c*9/5);
        System.out.format("%.2f",f);
        sc.close();
    }
}