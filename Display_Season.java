import java.util.Scanner;
class electricity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int u;
        u=sc.nextInt();
        if(u==4 || u==5 || u==6)
        {
            System.out.print("Summer");
        }
        else if(u==7 || u==10 || u==8 || u==9)
        {
            System.out.print("Rainy");
        }
        else if(u==11 || u==12 || u==1)
        {
            System.out.print("Winter");
        }
        else if(u==2 || u==3)
        {
            System.out.print("Spring");
        }
        else
        {
            System.out.print(-1);
        }
        sc.close();
    }
}