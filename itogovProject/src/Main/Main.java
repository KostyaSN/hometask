package Main;

import java.util.Scanner;



public class Main {
	
	static download.loadJSON loadJSON;
	static download.loadXML loadXML;
	static parsers.parserJson parserJson;
	static parsers.parserXML parserXML;
	
	private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) throws Exception{
		
		System.out.println("����� ���������� � �������� ������ ����� �����!");
		SelectPars();
		SelectWhatDo();
		
	}
	
		public static void SelectPars() throws Exception{//����� �������
			
			loadJSON = new download.loadJSON();
			loadXML = new download.loadXML();
			parserJson = new parsers.parserJson();
			parserXML = new  parsers.parserXML();
			
			Thread myLoadJ = new Thread(loadJSON);
			Thread myLoadX = new Thread(loadXML);
			Thread myParJS = new Thread(parserJson);
			Thread myParXML = new Thread(parserXML);
			
		System.out.println("�������� ������ ������ ���� ��������� �������� � ����������:"+
		"\n ������� 1 ��� ������ JSON"+
		"\n ������� 2 ��� ������ XML"+
		"\n ������� 3 ��� ���������� ������ ���������");

			String input = sc.next();
			
			if(input.equals("1")){System.out.println(" ������ JSON");
			myLoadJ.start();
			myLoadJ.join();
			myParJS.start();
			myParJS.join();
			}
			else if(input.equals("2")){System.out.println(" ������ XML");
			myLoadX.start();
			myLoadX.join();
			myParXML.start();
			myParXML.join();
			}
			else if(input.equals("3")){System.out.println(" ������� ���������� ��������"); System.exit(0);}
			else {System.out.println(
					"������� ������������ ��������(!), ���������� ������� ����� \n");
			 SelectPars();
			
		}	
	}
		
		public static void SelectWhatDo(){//����� �������� � ����������� �������
			
			System.out.println("\n������� ����� ���������� ������ ��������: \n"
					+ "������� 1 ��� ������ ���������� ������ � ������� \n"
					+ "������� 2 ��� ������ ������������ ������\n"
					+ "������� 3 ��� ����������� ������");
			String input = sc.next();
			
					
			
		}
		
	

}
