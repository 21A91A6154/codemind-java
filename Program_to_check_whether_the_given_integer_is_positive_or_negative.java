import java.util.Scanner;
class colour
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n<0)
        {
            System.out.print("Negative Number");
        }
        else
        {
            System.out.print("Positive Number");
        }
        sc.close();
    }
}