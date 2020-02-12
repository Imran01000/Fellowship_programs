package fellowship_programs;

import java.util.Scanner;

import java.lang.Math;
class Quadratic {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values of a,b and c:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int delta=(b*b-4*a*c);
    int r=Math.abs(delta);
    System.out.println("The value of delta is : "+delta);
    double r1=(double)(-b+Math.sqrt(r))/(2*a);
    double r2=(double)(-b-Math.sqrt(r))/(2*a);
    System.out.println("The value of r1 is : "+r1+" and the value of r2 is : "+r2);
  }
}