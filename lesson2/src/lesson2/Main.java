package lesson2;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		int[] myArray = vvod();
		vivod(myArray);
		sort(myArray);
		System.out.println("����� ����� ����������: ");
		vivod(myArray);
		System.out.println("������ ������ �����:");
		 for (int i = 0; i < myArray.length; i++) {
	            if (myArray[i] % 2 == 0) System.out.println(myArray[i]);
		 }
	}
	
	public static int[] vvod() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] myArray = new int[10];
		for (int i = 0; i < 10; i++)
		{myArray[i] = sc.nextInt();}
		return myArray;}
	
	
	public static void sort(int[] myArray){
		Arrays.sort(myArray);
	}
	
	public static void vivod (int[] myArray) {
	for(int i = 0; i < 10; i++){
		 System.out.println((i+1) + "-� ������� ������� = " +  myArray[i]);}} // ����� ������ �� ������� �� �������		
}
