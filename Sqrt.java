import java.util.Scanner;
import java.lang.Math;
class Sqrt {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number for Sqaure root:");
    double c=sc.nextDouble();
    double t=c;
    double epsilon=1e-15;
    if(c<0)
    {
      System.out.println("Something is wrong dear");
    }
    else
    {
      while(Math.abs(t-c/t)>epsilon*t)
        {
          t=(c/t + t)/2.0;
        }
        System.out.println(t);
    }
  }
}