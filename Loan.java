import java.util.Scanner;
class Sub
{
    void Details( int age,int exp,int salary)
    {
        if(age<18)
        System.out.println("employee is not eligible for loan");
        else if(age>=18 && exp<5)
        System.out.println("employee is eligible for 1 year loan");
        else if(age>=18 && exp>=5 && salary<2500)
        System.out.println("employee is eligible for 5 years loan");
        else if (age>=18 && exp>=5 && salary>=2500)
        System.out.println("employee is eligible for 7 years loan");
    }
}
public class Loan 
{
   public static void main(String args[])
   {
    int exp,age,salary;
    Scanner  in =new Scanner(System.in);
    System.out.println("enter age,exp,salary");
    age=in.nextInt();
    exp=in.nextInt();
    salary=in.nextInt();
    Sub S1=new Sub();
    S1.Details(age,exp,salary);
   }
}