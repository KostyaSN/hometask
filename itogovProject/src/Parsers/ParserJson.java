package parsers;

import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import get_set_ForPars.Root;


public class parserJson extends Thread {

	@Override
	public void run() {
	
	try{
		BufferedReader bufferdReader = new BufferedReader(new FileReader("KusVal.json"));
		Gson gson = new GsonBuilder().setDateFormat("yyy-MM-DD HH:mm").create();// вводить для дат и времени что бы gson понимал в каком формате 
		Root root = gson.fromJson(bufferdReader, Root.class);
		
		System.out.println(root.toString());
		
		
	} catch(Exception e){}

	}
}
