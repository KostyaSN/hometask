
 package lesson16class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextField;

/*public class Main {
        
    
    public static void main(String[] args) { //������ �������
        String s = "������ � ������ ����������� �������� �� ������� � ���������� ��������������� ������������ ������ ��������� �� ������� ����� ��������� �������. ��� ���������� � ����� ���������� � ���������� ���������, ��������� �������, ��� ������ ��������� ����������� ����� ������� ���������� � ������������, ������������, � ����� ��������� �� ��, ��� ����� ������ �� ������ ����� ������������� �������.����� ������������ ��� ����������������� ����� � ������������� ��������, ������� �������� ������� �������� � ���������. �� ������ ���������, ����������� ����������� �������� ����� ��������, ���� �� ����� �������� ������ ������������ ���������, �������������� ��� ���. ��� ��� � �������������, ��� � ��� �����, ��������, � ����� ����, � ������� ����� ����������.������ �����- � ����������� ����� �������� TUT. ��������� ������ ����� �������� �����. ������� �� ������������.";
                    String[] a = s.split("\\s"); //!!!!
                    Arrays.sort(a);
                    for (int i = 0; i < a.length - 1; i++) {
                        for (int j = 0; j < a.length - 1; j++) {
                            if (a[j].length() > a[j + 1].length()) {
                                String b = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = b;
                            }
                        }
                    }
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] != "") {
                            System.out.println(a[i]);
                        }
                    }   
        
        }
    
        
 
    }*/

 public class Main{

	 public static void main(String[] args){
		 String line;
		 List<String> list = new ArrayList<String>();
			try {
				LineNumberReader reader = new LineNumberReader(new FileReader("ptro.txt"));
				try {
					while((line = reader.readLine()) !=null){
						char a =line.charAt(line.length()-1);
					int b = Character.getNumericValue(a);
						if( b>=7){
							list.add(line.toUpperCase());
							}else{
						
						
						list.add(line); }}//}
				} catch (IOException e) {
					e.printStackTrace();}
			} catch (FileNotFoundException e) {
				e.printStackTrace();}
			
			System.out.println(list.toString());
			
			try{
                FileWriter writer = new FileWriter("Lib.txt");//sozdanie novogo faila i zapis v nego
                
                for(String line1 : list)
                {
                writer.write(line1);
                writer.write(System.getProperty("line.separator"));
                
                }
                
                writer.close();
                }catch (IOException ex){ex.printStackTrace();}
	 }
 }
	 
 

/*public class Main{ //������� 3
	public static void main (String[] args){
		int r = 123;
		int e = 111;
		Scanner sc = new Scanner(System.in);
		int sh = sc.nextInt();
		for (int i = 0; i<10; i++){if (sh==e){System.out.println("��� �������");}else{e=111*i;}
		{if (sh==r){System.out.println("��� �������");}else{r=r+111;}
		}
	}
	}}*/










