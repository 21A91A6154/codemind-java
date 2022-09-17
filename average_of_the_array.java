import java.util.Scanner;
class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        float avg,a,s=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextFloat();
            s=s+a;
        }
        avg=s/n;
        System.out.format("%.2f",avg);
        sc.close();
    }
}