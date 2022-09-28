import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,c=0,max=0,j,x=0;
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
            if(max<arr[i])
            {
                max=arr[i];
            }
            x++;
        }
    }
    if(x>0)
    {
       System.out.print(max);
    }
    else if(x==0)
    {
        System.out.print("-1");
    }
    }
}