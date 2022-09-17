import java.util.Scanner;
class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,i,a,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a%k==0)
            {
                c+=1;
            }
        }
        System.out.print(c);
        sc.close();
    }
}