import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    int n,i,j,k=0,sum=0,x=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
     k=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]==k)
        {
            x=i;
        }
    }
    for(i=0;i<=x;i++)
    {
        sum=sum+arr[i];
    }
    System.out.print(sum);
    }
}