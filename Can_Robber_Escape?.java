import java.util.Scanner;
class drop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,c=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=sc.nextInt();
            if(a%2==1)
            {
                c+=1;
            }
        }
        if(c<=2)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}