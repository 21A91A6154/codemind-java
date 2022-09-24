import java.util.Scanner;
class Array
{
       public static void main(String args[])
      {
           Scanner sc=new Scanner (System.in);
           int n,i,c=0;
           n=sc.nextInt();
          int x[]=new int[n];
          for(i=0;i<n;i++)
          {
               x[i]=sc.nextInt();
          }
          for(i=n-1;i>=0;i--)
          {
              if(i!=0)
              {
                 if(x[i]>x[i-1])
                 {
                    c++;
                 }
              }
          }
          if(c==n-1)
          {
              System.out.print("yes");
          }
          else
          {
            System.out.print("no");
          }
           sc.close();
      }
}