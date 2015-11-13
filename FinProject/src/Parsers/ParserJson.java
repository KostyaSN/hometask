package Parsers;

import java.io.BufferedReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Models.Bank;


public class ParserJson {

		public static Bank gsonParser(BufferedReader bufferedReader)
		{
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			return  gson.fromJson(bufferedReader, Bank.class);
		}
	

	}

