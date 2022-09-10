
import java.util.Scanner;
class colour
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.nextLine().charAt(0);
        if(c=='A' || c=='E'|| c=='I' || c=='O' || c=='U' || c=='a' || c=='i' || c=='o' || c=='e' || c=='u')
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
        sc.close();
    }
}