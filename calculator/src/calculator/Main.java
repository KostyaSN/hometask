package calculator;

import java.util.Scanner;
 
@SuppressWarnings("serial")
public class Main extends Exception {
   

	public Main(String msg) {super(msg);}

@SuppressWarnings("unused")
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b;
      double d = 0;
      String c;
     try{ a = Integer.parseInt(sc.next("\\d"));

      c = sc.next("\\+|\\-|\\*|\\/");



      b = Integer.parseInt(sc.next("\\d"));
      
      Vichel(a, b, 0, c);
      
      }
     catch(Exception me1) { //ловим нашу ошибку по названию класса
         System.err.print(me1);}
     
}


      public static void Vichel (int a, int b,double d , String c)throws Exception {
    	  
      if ("+".equals(c)) {
    	         d = a + b;
    	      } else if ("-".equals(c)) {
    	         d = a - b;
    	      } else if ("*".equals(c)) {
    	         d = a * b;}
    	      else if (b==0){throw new Exception("На нуль делить нельзя!");}// создаем текст ошибки
    	  
    	       else if ("/".equals(c)) { 
    	         d = (double) a / b; }
    	   System.out.println(d);
		
   }
}
