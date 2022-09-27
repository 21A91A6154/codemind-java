import java.util.Scanner;
class odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,avg=0,sum=0,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    for(i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    avg=sum/n;
    for(i=0;i<n;i++)
    {
        if(arr[i]<=avg)
        {
            c++;
        }
    }
    System.out.print(c);
    }
}