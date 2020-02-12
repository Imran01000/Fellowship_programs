package fellowship_programs;

import java.util.*;
class Tobinary {
  static int binary;
  static void  Tobinary(int number)
  {
    int r=0,i=1;
    while(number>0)
    {
       r=number%2;
      number=number/2;
     
      binary=binary+r*i;
      i=i*10;
    
    }
    System.out.println(binary);
  }
  public static void main(String[] args) {
    int rest;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();
    Tobinary(n);
       

    
  }
}