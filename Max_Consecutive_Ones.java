import java.util.Scanner;
class consecutive
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,j=0,max=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[50];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                c+=1;
            }
            else
            {
                brr[j]=c;
                c=0;
                j+=1;
            }
        }
        brr[j]=c;
        j+=1;
        for(i=0;i<j;i++)
        {
            if(brr[i]>max)
            {
                max=brr[i];
            }
        }
        System.out.print(max);
    }
}