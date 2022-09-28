import java.util.Scanner;
class first
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,a,z,x=0,c=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    a=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]==a)
        {
            x++;
            System.out.print(i+" ");
            break;
        }
    }
    for(i=n-1;i>=0;i--)
    {
        if(arr[i]==a)
        {
            c++;
            System.out.print(i+" ");
            break;
        }
    }
    if(x==0)
    {
        System.out.print(-1+" ");
    }
    if(c==0)
    {
        System.out.print(-1);
    }
    }
}