import java.util.Scanner;
class electricity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        int u;
        double k,y=0,z=0;
        a=sc.nextLine();
        b=sc.nextLine();
        u=sc.nextInt();
        if(u<=199)
        {
            k=u*1.20;
        }
        else if (u>=200 && u<=400)
        {
            k=u*1.50;
        }
        else if(u>=400 && u<=600)
        {
            k=u*1.80;
        }
        else
        {
            k=u*2.00;
        }
        if(u>=400)
        {
            y=0;
            y=(k*15)/100;
            //System.out.format("%.2f",y);
        }
        if(y>100)
        {
            z=k+y;
            System.out.format("%.2f",z);
        }
        else
        {
            y=100;
            z=k+y;
            System.out.format("%.2f",z);
        }
        
    }
}