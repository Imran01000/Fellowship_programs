package fellowship_programs;

import java.util.Scanner;
class Temprature_conversion {
  static double c,f;
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice :");
    System.out.println("1-is for celsius to fahrenheit and 2-is for fahrenheit to celsius");
    int n=sc.nextInt();
    switch(n)
    {
      case 1:System.out.println("Enter the Temprature in celsius");
             c=sc.nextInt();
             f=(c*9/5)+32;
             System.out.println(f+" in fahrenheit");
             break;


      case 2:System.out.println("Enter the Temprature");
             f=sc.nextInt();
             c=(f-32)*5/9;
             System.out.println(c+" in celsius"); 
             break;      

    }

  }
}