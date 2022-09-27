import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    int n,i,j,k=0,sum=0,x=0,a,b,c=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
     for(i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        {
            System.out.print(arr[i]+" ");
        }
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]%2==1)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }
}