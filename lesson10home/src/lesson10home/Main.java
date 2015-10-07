package lesson10home;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
static Scanner sc = new Scanner(System.in);

	private static String text = sc.nextLine();
			//"This new text \nThis new text2\nThis new text3\nThis new text4\n"; - просто текст
	private static String fileName = "C:/Users/KostyaSn/workspace/lesson10home/a.txt";
	 
	public static void main(String[] args) throws FileNotFoundException {
	 
	    //Запись в файл
	    FileWorker.write(fileName, text);
	    try(FileReader reader = new FileReader("C:/Users/KostyaSn/workspace/lesson10home/a.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   

	}

}
