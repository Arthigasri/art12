# art12
 import java.io.*;
     import java.util.*;
     public class Natural 
{
  public static void main(String args[])
  {
    int x,i = 1 ;
    int sum = 0;
    System.out.println("Enter the sum of number:");
    Scanner s = new Scanner(System.in);
    x = s.nextInt();
    while(i <= x)
    {
      sum = sum +i;
      i++;
    }
    System.out.println("Sum of "+x+" numbers is :"+sum);
  } 
}
