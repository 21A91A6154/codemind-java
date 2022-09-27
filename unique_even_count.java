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
        c=0;
        for(j=i;j<n;j++)
        {
            if(arr[j]%2==0)
            {
            if(arr[i]==arr[j])
            {
                c++;
            }
            }
        }
        if(c==1)
        {
            x++;
        }
    }
    System.out.print(x);
    }
}