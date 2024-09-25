import java.util.*;
public class Niven
{
   public static void main(String args[])
   {
       int m,n,k,sum=0;
       Scanner in=new Scanner(System.in);
       System.out.println("enter a number:");
       n=in.nextInt();
       m=n;
       while(n!=0)
       {
           k=n%10;
           sum=sum+k;
           n=n/10;
       }
       if(m%sum==0)
       {
           System.out.println( m+" is a niven number");
       }
       else
       System.out.println(m+" is not a niven number");
   }
}