import java.util.Scanner;
class pattern13
{
   public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int n,i,j,k=0,m=0;
         n=sc.nextInt();
         m=n+1;
         for(i=1;i<=n;i++)
         {
            for(j=1;j<=n;j++)
            {
                if(j<=m-1)
                {
                    System.out.print(j);
                }
            }
            m=m-1;
            System.out.println();
         }
   }
}