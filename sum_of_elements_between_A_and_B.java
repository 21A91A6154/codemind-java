import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,b,sum=0;
        n=sc.nextInt();
       int arr[]=new int[n];
      for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      a=sc.nextInt();
      b=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]>=a && arr[i]<=b)
        {
            sum=sum+arr[i];
        }
    }

        System.out.print(sum);
    }
}