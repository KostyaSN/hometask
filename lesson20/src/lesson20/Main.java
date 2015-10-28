package lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("¬ведите N: ");
		int n = sc.nextInt();
		if(n<100){
			if(n>=1){
				if (n%2==1){
					List<Integer> list = new ArrayList<>(n);
					
					for(int i=0; i<n;i++){
						int y = sc.nextInt();
						
						list.add(y);			
					}
					int v =list.size();
					for(int i=0; i<v;i++){int count = Collections.frequency(list, i);
						if(count<2){System.out.println("–езультат "+i);
						break;
						}else{
						i++;}
					}
						
				}else{System.out.println("¬ведено недопустимое занчение!");}
		}else{System.out.println("¬ведено недопустимое занчение!");}
	}else{System.out.println("¬ведено недопустимое занчение!");}		
 }
}
