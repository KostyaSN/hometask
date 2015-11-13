
package ChoosPars;

import Constant.Constants;
import helpers.HJsonGson;
import helpers.HJsonSimple;
import helpers.HXml;
import thread.AbsThread;

public class ParserFactory {
	
	public static AbsThread getParser(String typeOfParsing)
	{
		if(typeOfParsing.equals("1"))
		{
			System.out.println();
			System.out.println("Вы выбрали XML парсер.");
			return new HXml(Constants.URLX);
		}
		else if(typeOfParsing.equals("2"))
		{
			System.out.println();
			System.out.println("Вы выбрали Json Simple парсер.");
			return new HJsonSimple(Constants.JSONX);
		}
		else if(typeOfParsing.equals("3"))
		{
			System.out.println();
			System.out.println("Вы выбрали Json Gson парсер.");
			return new HJsonGson(Constants.JSONX);
		}
		
		return null;
	}
}
