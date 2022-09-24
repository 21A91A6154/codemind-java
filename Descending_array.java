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
          for(i=0;i<n;i++)
          {
               if(i!=n-1)
               {
                   if(x[i]<x[i+1])
                   {
                       c+=1;
                       break;
                   }
               }
          }
          if(c>0)
          {
              System.out.print("no");
          }
          else
          {
              System.out.print("yes");
          }
         sc.close();
      }
}