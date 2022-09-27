import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    int n,i,j,max=0,min=9999,c=0,x=0;
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
        if(c==arr[i])
        {
            x++;
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
    }
    if(x==0)
    {
        System.out.print("-1");
    }
    else
    {
         System.out.print(min+" ");
         System.out.print(max);
    }
    }
}