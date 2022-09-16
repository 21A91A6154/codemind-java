import java.util.Scanner;
class drop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%3==0)
        {
            System.out.print("Pling");
        }
        if(n%5==0)
        {
            System.out.print("Plang");
        }
        if(n%7==0)
        {
            System.out.print("Plong");
        }
        if(n%3!=0 && n%5!=0 && n%7!=0)
        {
            System.out.print(n);
        }
    }
}