import java.util.Scanner;
class battle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n1,n2,i,j,k=0,c=0;
    n1=sc.nextInt();
    n2=sc.nextInt();
    for(i=(n1+n2)+1;;i++)
    {
        c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            k=i;
            break;
        }
    }
    System.out.print(k-(n1+n2));
    }
}