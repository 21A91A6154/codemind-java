import java.util.Scanner;
class optimal
{
public static int partition(int arr[],int l,int n)
{
    int i,j,p,temp;
    p=n;
    for(i=l,j=l;j<p;j++)
    {
        if(arr[j]<arr[p])
        {
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
        }
    }
    temp=arr[i];
    arr[i]=arr[p];
    arr[p]=temp;
    return i;
}
 public static void quick_sort(int arr[],int l,int n)
{
    int p;
    if(l<n)
    {
        p=partition(arr,l,n);
        quick_sort(arr,l,p-1);
        quick_sort(arr,p+1,n);
    }
}
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
    int t=0,k=0;
    t=sc.nextInt();
    for(k=0;k<t;k++)
    {
        int i=0,n=0,m=0,l=0,y=0,w=0,r=0,e=0,z=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[2*n];
        int crr[]=new int[2*n];
        int drr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            brr[m]=arr[i];
            m=m+1;
            brr[m]=i;
            m=m+1;
        }
        l=m;
        quick_sort(arr,0,n-1);
        for(i=0;i<n;i++)
        {
            crr[y]=arr[i];
            y++;
            crr[y]=i;
            y++;
        }
        w=y;
        for(i=0;i<2*n;i++)
        {
            if(i%2==0)
            {
                if(brr[i]!=crr[i])
                {
                    z+=1;
                    drr[r]=crr[i];
                    r+=1;
                }
            }
        }
        e=r;
        if(z==0)
        {
            System.out.print(z);
        }
        else
        {
            System.out.print(drr[e-1]-drr[0]);
        }
        System.out.println();
    }
   }
}