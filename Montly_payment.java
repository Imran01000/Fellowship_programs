package fellowship_programs;

import java.util.Scanner;
import java.lang.Math;
class Monthly_payment {
  public static void main(String[] args) {
    int P=Integer.parseInt(args[0]);
    int Y=Integer.parseInt(args[1]);
    int R=Integer.parseInt(args[2]);
    double r=R/(12*100);
    double n=12*Y;
    System.out.println(r+"  "+n);
    double payment=(P*r)/(1-Math.pow((1+r),n));
    System.out.println("The payment you have to pay is : "+payment);
  }
}