package Main;

import parsers.parcerJson;
import parsers.parserXML;

public class Main {
	
	static loading load;
	static parcerJson parJs;
	static parserXML parXML;
	
	public static void main(String[] args){
		
		load = new loading();
		parJs = new parcerJson();
		parXML = new parserXML();
		
		Thread myLoad = new Thread(load);
		Thread myParJS = new Thread(parJs);
		Thread myParXML = new Thread(parXML);
		
	
		try{
		myLoad.start();
		myLoad.join();
		myParXML.start();
		myParXML.join();
		myParJS.start();
		myParJS.join();
		
		
		}catch(Exception e){}
		
		
	}

}
