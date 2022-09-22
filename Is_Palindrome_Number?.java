import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,a,c=0;
            a=sc.nextInt();
            int flag=0;
            int d=(int)Math.log10(a);
            while(a>0)
            {
              int  r1=a%10;
              int r2=a/(int)Math.pow(10,d);
              if(r1!=r2)
              {
                 flag=1;
                 break;
              }
              a=a%(int)Math.pow(10,d);
              a=a/10;
              d-=2;
            }
            if(flag==0)
            {
               c+=1;
            }
        System.out.print(c+1);
    }
}