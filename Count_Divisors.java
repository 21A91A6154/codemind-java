import java.util.Scanner;
class divisors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,r,k,i,c=0;
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                c+=1;
            }
        }
        System.out.print(c);
        sc.close();
    }
}