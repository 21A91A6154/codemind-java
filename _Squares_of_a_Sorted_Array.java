import java.util.Scanner;
class sorted
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
    int p,i;
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
    int n,i,k=0,j=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    int brr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]<0)
        {
            k=-(arr[i]);
        }
        else
        {
            k=arr[i];
        }
        arr[i]=k*k;
    }
    quick_sort(arr,0,n-1);
    for(i=0;i<n;i++)
    {
         System.out.print(arr[i]+" ");
    }
}
}