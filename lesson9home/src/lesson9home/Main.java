package lesson9home;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {

	public static void main(String[] args){ //zadanie 1
		
		ArrayList<String> list = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("ƒл€ завершени€ ввода введите '*'");
		System.out.println("¬ведите значение: ");
		first:
		for(sc.hasNext();;){
			String sd = sc.nextLine();
		 if
		(sd.equals("*")) {
	    System.out.println("¬вод завершен");
		break first;
			}
		else 
		{list.add(sd);
		}}
		
		int size=list.size();
		
		for(int i = 0; i<size;i++){
			String prom=list.get(i).toString().replaceAll("a", "");
			list.set(i,prom );
			System.out.println(list.get(i));
		}
		@SuppressWarnings({ "rawtypes", "unchecked" }) // zadanie 2
		HashSet fd= new HashSet(list);
		System.out.println("«начени€ без дубликатов: "
				+ ""+fd);

		
		}		
	}
*/

class Main{ //zadanie3
	
	public static void main(String[] args){

		String[] men= new String[10];
		men[0] ="Igor I.F.";
		men[1] ="Vasya U.O.";
		men[2] ="Luka A.G.";
		men[3] ="Lol G.H.";
		String[] wmen= new String[10];
		wmen[0] ="Elena T.U.";
		wmen[1] ="Nalalia W.F.";
		wmen[2] ="Jessi J.K.";
		wmen[3] ="Lewa H.U.";
		
		
		
		Map<Integer, String> hashmap = new HashMap<Integer,String>();
		hashmap.put(1, wmen[0]);
		hashmap.put(2, wmen[1]);
		hashmap.put(3, wmen[2]);
		hashmap.put(4, wmen[3]);
		hashmap.put(5, men[0]);
		hashmap.put(6, men[1]);
		hashmap.put(7, men[2]);
		hashmap.put(8, men[3]);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите men или wmen имена требуютс€");
		String vvod = sc.nextLine();
		Random rand = new Random();
		int n = (rand.nextInt(3) + 1);
		if(vvod.equals("men")){
			System.out.println(hashmap.get(4+n));
		} 
		else if
		(vvod.equals("wmen")){
			System.out.println(hashmap.get(n));
		}else{
			System.out.println("¬ведено что то не то");
		}
		
	}
	
}
