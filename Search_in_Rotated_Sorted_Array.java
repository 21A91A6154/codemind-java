import java.util.Scanner;
class sorted
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,a,i,c=0;
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
            System.out.print(i+" ");
            c++;
        }
    }
    if(c==0)
    {
        System.out.print("-1");
    }
    }
}