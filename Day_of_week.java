package fellowship_programs;

import java.util.*;
class Day_of_week{
  public static void main(String[] args) {
    int d=Integer.parseInt(args[0]);
    int m=Integer.parseInt(args[1]);
    int y=Integer.parseInt(args[2]);
    long y0;
    long x;
    long m0;
    long d0;
    y0=y-(14-m)/12;
    x=y0+y0/4-y0/100+y0/400;
    m0=m+12*((14-m)/12)-2;
    d0=(d+x+31*m0/12)%7;
    switch((int)d0)
    {
      case 0:System.out.println("Sunday");
             break;
      case 1:System.out.println("Monday");
             break;       
      case 2:System.out.println("tuesday");
             break; 
      case 3:System.out.println("Wednesday");
             break;
      case 4:System.out.println("Thursday");
             break;
      case 5:System.out.println("Friday");
             break;
      case 6:System.out.println("Saturday");
             break;                                    
    }
    
    System.out.println("The day is : "+d0);
  }
}