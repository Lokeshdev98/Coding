import java.util.*;
class Array
{
  int min,i,j,temp=0;
  void display(int a[],int n)
  {
    int i,j,min,temp=0;
    for(i=0;i<n-1;i++)
    {
      min=i;
      for(j=i+1;j<n;j++)
      {
       if(a[j]<a[min])
       {
         min=j;
       }
      }
        temp=a[min];
        a[min]=a[i];
        a[i]=temp;
    }
     for(i=0;i<n;i++)
     {
    
      System.out.print(a[i]+"\t");
     }
  }
}
public class Selectionsort
{
  public static void main(String[] args)
  {
    int a[]=new int[100];
    int i,j,n;
    System.out.println("enter the value of n:");
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
    System.out.println("enter the array elements:");
    for(i=0;i<n;i++)
    {
      System.out.println("enter a["+i+"] element:");
      a[i]=in.nextInt();
    }
    System.out.println("Before sorting the array elements are:");
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+"\t");
    }
    System.out.println();
    System.out.println("After sorting the array elements are:");
    Array ad = new Array();
    ad.display(a,n);
  }
}
