import java.util.Scanner;
class lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,k=1,x=0,c=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    while(c<=1)
    {
        x=0;
        for(i=0;i<n;i++)
        {
            if(k%arr[i]!=0)
            {
                x+=1;
            }
        }
        if(x==0)
        {
            c+=1;
        }
        k+=1;
    }
    System.out.print((k-1)/2);
    }
}