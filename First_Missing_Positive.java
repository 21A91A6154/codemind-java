import java.util.Scanner;
class missing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,k=1,m=1,c=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    while(k<=1)
    {
        c=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==m)
            {
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.print(m);
            k+=1;
        }
        m+=1;
    }
    }
}