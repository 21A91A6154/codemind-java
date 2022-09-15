import java.util.Scanner;
class tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        j=sc.nextInt();
        for(i=1;i<=j;i++)
        {
            if(i%2==1)
            {
                System.out.format(n+" x "+i+" = "+n*i);
                System.out.println();
            }
        }
    }
}