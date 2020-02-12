package fellowship_programs;

import java.util.Scanner;
class Leapyear {
  public static void main(String[] args) {
    int n;
    System.out.println("Enter the Number to be checked leap year or not");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n%4==0&&n%100!=0||n%400==0)
    {
      System.out.println("The given number is leap year");
    }
    else
    {
      System.out.println("The given number is not leap year");
    }
  }
}