import java.util.Scanner;
class numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
	int n,i,d,c=0,x=0;
	n=sc.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		c=0;
		while(arr[i]>0)
		{
			d=arr[i]%10;
			arr[i]=arr[i]/10;
			c++;
		}
		if(c==2||c==4||c==6)
		{
			x++;
		}
	}
	System.out.print(x+" ");
    }
}