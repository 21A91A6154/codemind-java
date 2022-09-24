import java.util.Scanner;
class Array
{
       public static void main(String args[])
      {
           Scanner sc=new Scanner (System.in);
           int n,i,c=0,s=0,z=0,j;
           float avg=0;
           n=sc.nextInt();
          int x[]=new int[n];
          for(i=0;i<n;i++)
          {
               x[i]=sc.nextInt();
          }
          for(i=n-1;i>=0;i--)
          {
              c=0;
              for(j=1;j<=x[i];j++)
              {
                  if(x[i]%j==0)
                  {
                      c+=1;
                  }
              }
              if(c==2)
              {
                  s=s+x[i];
                  z+=1;
              }
          }
          avg=(float)s/z;
          System.out.format("%.2f",avg);
           sc.close();
      }
}