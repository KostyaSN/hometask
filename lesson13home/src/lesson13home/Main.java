package lesson13home;

import java.util.Random;
import java.util.Scanner;
public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{String vvod = sc.nextLine();//вводим слово с клавиатуры
		if(vvod.equals("start")){  //сверяем введенное значени с клавиатуры со словом старт
			
			Main main = new Main();
			
			MyThread myThread1 = new MyThread(); //первый поток 
			myThread1.setMain(main);
			
			MyThread myThread2 = new MyThread(); //второй поток
			myThread2.setMain(main);
			
			myThread1.start();
			myThread2.start();
		}
    }
		
		catch(Exception e){System.out.println("Введено неверное значение");
		}
	}
		
	public void print10(){
		synchronized(this){for(int i = 0; i<10; i++){
			Random random = new Random();
			System.out.print(random.nextInt(100) + 1 + " ");//случайное занчение от 1 до 100
		}
	System.out.println(Thread.currentThread().getName());//выводим название потока
	}
  }
}
