import java.util.Scanner;
class adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
    int n,k,d,sum=0,x,add=0,temp=0,f;
    n=sc.nextInt();//12
    temp=n;
    while(n!=0)
    {
      d=n%10;
      n=n/10;
      sum=sum*10+d;//21
    }
    k=temp*temp;//144
    x=sum*sum;//441
    while(x!=0)
    {
        f=x%10;
        x=x/10;
        add=add*10+f;//144
    }
    if(k==add)
    {
        System.out.print("True");
    }
    else
    {
        System.out.print("False");
    }
    }
    
}