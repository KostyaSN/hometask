package lesson13home;

import java.util.Random;
import java.util.Scanner;
public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{String vvod = sc.nextLine();//������ ����� � ����������
		if(vvod.equals("start")){  //������� ��������� ������� � ���������� �� ������ �����
			
			Main main = new Main();
			
			MyThread myThread1 = new MyThread(); //������ ����� 
			myThread1.setMain(main);
			
			MyThread myThread2 = new MyThread(); //������ �����
			myThread2.setMain(main);
			
			myThread1.start();
			myThread2.start();
		}
    }
		
		catch(Exception e){System.out.println("������� �������� ��������");
		}
	}
		
	public void print10(){
		synchronized(this){for(int i = 0; i<10; i++){
			Random random = new Random();
			System.out.print(random.nextInt(100) + 1 + " ");//��������� �������� �� 1 �� 100
		}
	System.out.println(Thread.currentThread().getName());//������� �������� ������
	}
  }
}
