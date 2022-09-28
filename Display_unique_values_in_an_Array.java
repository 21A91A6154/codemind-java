import java.util.Scanner;
class display
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
        for(j=0;j<n;j++)
        {
           if(arr[i]==arr[j])
           {
               c++;
           }
        }
        if(c==1)
        {
            x++;
            System.out.print(arr[i]+" ");
        }
    }
    if(x==0)
    {
        System.out.print("-1");
    }
    }
}