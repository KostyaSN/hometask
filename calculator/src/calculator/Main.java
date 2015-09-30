package calculator;

import java.util.Scanner;
 
public class Main {
 


public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b;
      double d = 0;
      String c;
     try{ a = Integer.parseInt(sc.next("\\d"));
     
     
      c = sc.next("\\+|\\-|\\*|\\/");
      
      b = Integer.parseInt(sc.next("\\d"));
      
      if ("+".equals(c)) {
         d = a + b;
      } else if ("-".equals(c)) {
         d = a - b;
      } else if ("*".equals(c)) {
         d = a * b;}
       else if ("/".equals(c)) { 
         d = (double) a / b;
      }}
      catch(Exception e){System.out.println("Что то пошло не так");}
      System.out.println(d);
   }
}
