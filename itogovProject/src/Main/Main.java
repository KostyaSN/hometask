package Main;

import java.util.Scanner;



public class Main {
	
	static download.loadJSON loadJSON;
	static download.loadXML loadXML;
	static parsers.parserJson parserJson;
	static parsers.parserXML parserXML;
	
	private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) throws Exception{
		
		System.out.println("Добро пожаловать в програму обзора курса валют!");
		SelectPars();
		SelectWhatDo();
		
	}
	
		public static void SelectPars() throws Exception{//выбор парсера
			
			loadJSON = new download.loadJSON();
			loadXML = new download.loadXML();
			parserJson = new parsers.parserJson();
			parserXML = new  parsers.parserXML();
			
			Thread myLoadJ = new Thread(loadJSON);
			Thread myLoadX = new Thread(loadXML);
			Thread myParJS = new Thread(parserJson);
			Thread myParXML = new Thread(parserXML);
			
		System.out.println("Выберете данные какого типа требуется получить и обработать:"+
		"\n Введите 1 для выбора JSON"+
		"\n Введите 2 для выбора XML"+
		"\n Введите 3 для завершения работы программы");

			String input = sc.next();
			
			if(input.equals("1")){System.out.println(" Выбран JSON");
			myLoadJ.start();
			myLoadJ.join();
			myParJS.start();
			myParJS.join();
			}
			else if(input.equals("2")){System.out.println(" Выбран XML");
			myLoadX.start();
			myLoadX.join();
			myParXML.start();
			myParXML.join();
			}
			else if(input.equals("3")){System.out.println(" Выбрано Завершение програмы"); System.exit(0);}
			else {System.out.println(
					"Введено недопустимое значение(!), попробуйте выбрать снова \n");
			 SelectPars();
			
		}	
	}
		
		public static void SelectWhatDo(){//выбор действий с полученными данными
			
			System.out.println("\nВведите какую информацию хотите получить: \n"
					+ "Введите 1 для вывода полученных данных в консоль \n"
					+ "Введите 2 для вывода определенной валюты\n"
					+ "Введите 3 для конвертации валюты");
			String input = sc.next();
			
					
			
		}
		
	

}
