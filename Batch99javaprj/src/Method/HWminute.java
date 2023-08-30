package Method;

import java.util.Scanner;

public class HWminute {
  static long hr;
  static long min;
  static long sec;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String con;
    do {
    long allinsec = hms_to_secs(hr,min,sec);
    System.out.println(allinsec+" sec");
    System.out.println("Do you want to do again?Pls type 'yes' or 'no'. ");
     con = sc.next();
    }while(con.equalsIgnoreCase("yes"));
    System.out.println("System ended");
  }
  public static long hms_to_secs(long hour,long minute,long second) {
    
    System.out.println("Enter hours : ");
    long hr = sc.nextLong();
    if(hr>12) {
       hr = hr - 12;
    }
    System.out.println("Enter minutes : ");
    long min = sc.nextLong();
    if(min>59) {
      hr++;
      min -= 60;
    }
    System.out.println("Enter second : ");
    long sec = sc.nextLong();
    if(sec>59) {
      min++;
      sec -= 60;
    }
    Long tsecond = hr*3600 + min*60+sec;
    return tsecond;
  }
  }
