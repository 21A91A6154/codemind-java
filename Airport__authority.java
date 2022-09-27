import java.util.Scanner;
class airport
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
    int n,i,t,sum=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    t=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]<=t)
        {
            sum=sum+1;
        }
        else
        {
            sum=sum+2;
        }
    }
    System.out.print(sum);
    }
}