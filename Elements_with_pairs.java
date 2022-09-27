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
     for(i=0;i<n;i++)
    {
        if(n%2==0)
        {
            System.out.print(arr[i]+" ");
        }
        else
        {
            System.out.print(arr[i]+" ");
        }
    }
    if(n%2==1)
    {
        System.out.print("0");
    }
    }
}