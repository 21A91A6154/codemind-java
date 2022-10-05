import java.util.Scanner;
class jarvis
{
public static int partition(int arr[],int l,int n)
{
    int p,i,j,temp;
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
    int t,k,i=0,d=0,z=0,n,y=0;
    t=sc.nextInt();
    for(k=0;k<t;k++)
    {
        y=0;
        n=sc.nextInt();
        i=0;
        int arr[]=new int[n];
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            arr[i]=d;
            i+=1;
        }
        z=i;
        quick_sort(arr,0,z-1);
        for(i=0;i<z;i++)
        {
            if(i!=z-1)
            {
                if(arr[i+1]-arr[i]!=1)
                {
                    y+=1;
                    System.out.print("NO");
                    break;
                }
            }
        }
        if(y==0)
        {
            System.out.print("YES");
        }
        System.out.println();
    }
}
}