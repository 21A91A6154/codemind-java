import java.util.Scanner;
class happy
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
 int i,j,num,temp,sum=0; 
 num=sc.nextInt();
  while(sum!=1 && sum!=4) 
  { 
   sum=0; 
   while(num>0) 
  { 
    j=num%10; 
    sum+=(j*j); 
    num=num/10;  
  } 
  num=sum; 
  } 
   
  if(sum==1) 
  {
 System.out.print("True");
  }
 else 
 {
 System.out.print("False"); 
 }
    }
} 