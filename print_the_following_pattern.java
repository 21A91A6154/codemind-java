import java.util.Scanner;
class pattern3
{
   public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int n,i,j,k=0;
         n=sc.nextInt();
         k=n;
         for(i=1;i<=n;i++)
         {
              for(j=1;j<=n;j++)
              {
                     System.out.print(k+" ");
                     k-=1;
              }
              k=n;
              System.out.println();
         }
   }
}