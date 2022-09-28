import java.util.Scanner;
class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,c=0,j;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        c=0;for(j=0;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                c++;
            }
        }
        if(c>n/2)
        {
            System.out.print(arr[i]+" ");
            break;
        }
        else
        {
            continue;
        }
    }
    }
}