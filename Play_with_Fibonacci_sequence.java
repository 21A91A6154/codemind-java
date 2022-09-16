import java.util.Scanner;
class prime
{
    public static void main(String rags[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=1,i=0,j=1,d=0;
        a=sc.nextInt();
        System.out.print(i+" ");
        System.out.print(j+" ");
        while(c<a-1)
        {
            d=i+j;
            System.out.print(d+" ");
            c+=1;
            i=j;
            j=d;
        }
    }
}