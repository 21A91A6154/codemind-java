import java.util.Scanner;
class numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,min=0,c=0,j;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        c=0;
        min=arr[i];
        for(j=0;j<n;j++)
        {
            if(min>arr[j])
            {
                c++;
            }
        }
        System.out.print(c+" ");
    }
    }
}