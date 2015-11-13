package Parsers;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.util.Date;
	import java.util.Iterator;

	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;

	import Models.Bank;
	import Models.Currency;;

	public class SimpleJson {


		@SuppressWarnings("unchecked")
		public static Bank jsonParser(BufferedReader bufferedReader)
		{
			Bank bank = new Bank();
			Currency currenc;
			
			JSONParser jsonParser = new JSONParser();
			JSONArray jsonArray = new JSONArray();
			
			try {
				JSONObject jsonObject = (JSONObject)jsonParser.parse(bufferedReader);
				
				bank.setBankName((String)jsonObject.get("bankName"));
				bank.setBankLocation((String)jsonObject.get("bankLocation"));
				bank.setDate((Date)jsonObject.get("date"));
				bank.setBaseCurrencyId((String)jsonObject.get("baseCurrencyId"));
				
				if(jsonObject.containsKey("currency"))
				{
					jsonArray = (JSONArray)jsonObject.get("currency");
				}
				else
				{
					System.out.println("Не верный формат документа!");
				}
				
				Iterator<JSONObject> iterator = jsonArray.iterator();
				
				while(iterator.hasNext())
				{
					currenc = new Currency();
					JSONObject obj = iterator.next();
					
					currenc.setName((String)obj.get("name"));
					currenc.setId((int) obj.get("id"));
					currenc.setCode((int)obj.get("code"));
					currenc.setRate((double) obj.get("rate"));
					currenc.setVisible((boolean) obj.get("visible"));
					
					
					bank.setList(currenc);
				}
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			return bank;
		}
	}

