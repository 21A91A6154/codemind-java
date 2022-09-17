import java.util.Scanner;
class evenodd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,x=0,d;
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            if(d%2==0)
            {
                c+=1;
            }
            else
            {
                x+=1;
            }
        }
        if(c>0 && x==0)
        {
            System.out.print("Even");
        }
        else if(c==0 && x>0)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
        sc.close();
    }
}