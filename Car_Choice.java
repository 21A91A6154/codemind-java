import java.util.Scanner;
class disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=0,i;
        float a,b,c,d;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
           a=sc.nextFloat();
           b=sc.nextFloat();
           c=sc.nextFloat();
           d=sc.nextFloat();
           if(c/a<d/b)
           {
               System.out.println("-1");
           }
           else if(c/a==d/b)
           {
               System.out.println("0");
           }
           else
           {
               System.out.println("1");
           }
        }
        sc.close();
    }
}