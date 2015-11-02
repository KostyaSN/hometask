package Parsers;

import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Models.Root;


public class ParserJson extends Thread {

	@Override
	public void run() {
	
	try{
		BufferedReader bufferdReader = new BufferedReader(new FileReader("KusVal.json"));
		Gson gson = new GsonBuilder().setDateFormat("yyy-MM-DD HH:mm").create();// ������� ��� ��� � ������� ��� �� gson ������� � ����� ������� 
		Root root = gson.fromJson(bufferdReader, Root.class);
		
		System.out.println(root.toString());
		
		
	} catch(Exception e){}

	}
}
