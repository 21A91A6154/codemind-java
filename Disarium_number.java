import java.util.Scanner;
class disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,c=0,d,l;
        double s=0;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            c+=1;
        }
        l=temp;
        while(temp!=0)
        {
            d=temp%10;
            temp=temp/10;
            s=s+Math.pow(d,c);
            c-=1;
        }
        if(l==s)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        sc.close();
    }
}