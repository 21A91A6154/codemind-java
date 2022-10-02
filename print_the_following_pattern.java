import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        int n,i,j,k=1;
        n=sc.nextInt();
        for(c=65;k<=n;c++)
        {
            k+=1;
            for(j=0;j<n;j++)
            {
                System.out.print((char)c+" ");
            }
            System.out.println();
        }
    }
}