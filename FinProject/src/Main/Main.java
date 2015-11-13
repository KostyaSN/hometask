

package Main;

import java.util.Scanner;

import manager.Manager;

public class Main {
	
	
	private static Scanner scanner = new Scanner(System.in);
	private static Manager manager = Manager.getInstance();
	
	public static void main(String[] args) {
	
		System.out.println("Добро пожаловать в программу курса валют!\n"
				+ "Выберите с помощью каких данных предпоситаете начать работу\n");
		
		choiceOfParsing();
		choiseOperation();
		
		scanner.close();
	}
			 static void choiseOperation()
	{
		boolean check = false;
		
		System.out.println();
				while(!check)
		{
			printMenu(4);
			
			String inputString = scanner.nextLine();
			checkInput(inputString);
			
			
			if(inputString.matches("^[1-5]$"))
			{
				switch(inputString)
				{
				
					case "1":
						manager.BankInfo();
						break;
						
					case "2":
						manager.viewCurrency();
						break;
						
					case "3":
						printMenu(6);
						break;
					
					case "4":
						printMenu(5);
						break;
						
					case "5":
						printMenu(7);
						System.exit(-1);
						break;
						
					default:
						printMenu(1);
						break;
				}
			}
			else
			{
				printMenu(1);
			}
		}
	}

	public static void choiceOfParsing()
	{
		boolean check = false;
		
		
		while(!check)
		{
			printMenu(2);

			String inputString = scanner.nextLine();
			checkInput(inputString);
			
			if(inputString.matches("^[1-3]$")){
				
				manager.getParser(inputString);
				break;
				}
			else
			{
				printMenu(1);
			}
		}
	}
	

	public static void printMenu(int menuNumber)
	{
		switch(menuNumber)
		{
			case 1:
				System.out.println("\nВы ввели неверные данные, повторите попытку!");
				break;
				
			case 2:System.out.println("\n"
					+ "\n Пожалуйста, выберите тип парсера для получения информации:"
						+ "\n 1 - XML парсер. \n 2 - Json simple парсер(В тестовом режиме). \n 3 - Json Gson парсер.\n"
						+ "Введите цифру:");break;
				
			case 3:System.out.println("\nПарсенг окончен, хотите попробовать парсить другим парсером? \n 1 - Да. \n 2 - Нет.\n"
						+ "Введите цифру:");break;
				
			case 4:System.out.println("\nПожалуйста, выберите необходимую операцию:\n 1 - Поиск данных о банке. \n 2 - Просмотр доступных валют"
						+ " \n 3 - Поиск валют по назавнию. \n 4 - Сортировка валют \n 5 - Покинуть программу\n"
						+ "Введите цифру:");break;
				
			case 5:System.out.println("\nПожалуйста, выберите сортировку:\n 1 - Сортировка стоимости \n"
						+ "Введите цифру:");break;
					
			case 6:System.out.println("Функция пока в разработке");break;
				
			case 7:
				System.out.println("Вы покинули программу");
				break;
		}
	}
	
	public static void checkInput(String input)
	{
		if(input.toLowerCase().equals("exit"))
		{
			printMenu(7);
			System.exit(0);
		}
	}
}
