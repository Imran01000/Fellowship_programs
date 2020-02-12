package fellowship_programs;

import java.lang.*;
class Powerof2 {
  public static void main(String[] args){
    //System.out.println("Enter number");
    int a=Integer.parseInt(args[0]);
    
    int b[]=new int[30];
    for(int i=1;i<=a;i++)
    {
      b[i]=(int)Math.pow(2, i);
      
    }
    for(int i=1;i<=a;i++)
    {
      System.out.print(b[i]+" ");
    }
    System.out.println();
    for(int i=0;i<a;i++)
    {
      if(b[i]%4==0&&b[i]%100!=0||b[i]%400==0)
      {
        System.out.println("Leap years number: "+b[i]);
      }
    }
  }
}