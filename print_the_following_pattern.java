import java.util.Scanner;
class pattern13
{
   public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int n,i,j,k=0,m=0;
         n=sc.nextInt();
         m=1;
         for(i=1;i<=n;i++)
         {
            for(j=1;j<=n;j++)
            {
                if(j==m)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("x");
                }
            }
            m=m+1;
            System.out.println();
         }
   }
}