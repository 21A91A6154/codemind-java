import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    int n,i,j,c=0,x=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
     if(n%2==0)
    {
        for(i=0;i<n;i++)
        {
            if(i<n/2)
            {
                System.out.print(arr[i]+" ");
                System.out.print(arr[n-1-i]+" ");
            }
        }
    }
    else
    {
        for(i=0;i<n;i++)
        {
            if(i<n/2)
            {
                System.out.print(arr[i]+" ");
                System.out.print(arr[n-1-i]+" ");
            }
        }
        System.out.print(arr[n/2]+" ");
        System.out.print("0");
    }
    }
}