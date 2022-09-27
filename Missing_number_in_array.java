import java.util.Scanner;
class missing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int k,i,n,j,sum=0,s=0,m=0;
    k=sc.nextInt();
    int arr[]=new int[50];
    for(i=0;i<k;i++)
    {
        s=0;
        n=sc.nextInt();
        for(j=0;j<n-1;j++)
        {
            arr[j]=sc.nextInt();
            s=s+arr[j];
        }
        sum=(n*(n+1))/2;
        m=sum-s;
        System.out.println(m);
    }
    }
}