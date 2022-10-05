import java.util.Scanner;
class clothing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,c=0,p=0,j;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]!=-1)
        {
            c=1;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    c++;
                    arr[j]=-1;
                }
            }
            p=p+c/2;
        }
    }
    System.out.print(p);
    }
}