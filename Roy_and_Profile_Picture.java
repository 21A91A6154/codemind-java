import java.util.Scanner;
class roy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,o,w,h;
        o=sc.nextInt();
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            w=sc.nextInt();
            h=sc.nextInt();
            if(w>=o && h>=o)
            {
                if(w==h)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
            else if(w<o || h<o)
            {
                System.out.println("UPLOAD ANOTHER");
            }
        }
        sc.close();
    }
}