import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    int n,i,j,c=0,sum=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=0;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                if(arr[i]%2==1)
                {
                c++;
                if(c==1)
                {
                   sum=sum+arr[i];
                }
                if(j>i)
                {
                   arr[j]=0;
                }
                }
            }
        }
    }
    System.out.print(sum);
    }
}