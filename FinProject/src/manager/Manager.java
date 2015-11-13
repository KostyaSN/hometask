
package manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ChoosPars.ParserFactory;
import Models.Bank;
import Models.Currency;
import thread.AbsThread;

public class Manager {

	private Bank bank;
	
	private Manager(){}


	public void getParser(String typeOfParsing)
	{
		this.startParsing(ParserFactory.getParser(typeOfParsing));
	}
	
	 void startParsing(AbsThread myThread)
	{
		myThread.start();
		System.out.println("Парсер запущен...");
		
		try {
			myThread.join();
			this.setBank(myThread.getBank());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	

	public void viewCurrency()
	{
		List<Currency> list = bank.getList();
		System.out.println("\n Валюты:");
		
		for (Currency currency : list) {
			System.out.println(currency.toString());
		}
	}
	

	public void BankInfo()
	{
		
		System.out.printf("\n Банк "+bank.getBankName()+""
				+ "\n В городе "+bank.getBankLocation()+"\n"
						+ " Индификационный номер бака "+bank.getBaseCurrencyId()+""
				+ "\n Дата обновления данных "+bank.getDate());
	
	}
	
	
	
	public void comparator(String type)
	{
		String message = "";
		List<Currency> currency = bank.getList();
		if(type.equals("1")){
			message = "Валюты, отсортированные по стоимости:";
			Collections.sort(currency,new CompareExperience());
		}
		
		System.out.println();
		System.out.println(message);
		for (Currency currenc : currency) {
			System.out.println(currenc.toString());
		}
	}
	
	
	
	static class CompareExperience implements Comparator<Currency>{
		
		@Override
		public int compare(Currency o1, Currency o2) {
			Double stoim1 = o1.getRate();
			Double stoim2 = o2.getRate();
			
			if(stoim1 > stoim2){
				return 1;
			}
			else if(stoim1 == stoim2){
				return 0;
			}
			else{return -1;}
		}
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;}	
	
	public Bank getBank() {
		return bank;}

	private static class SingletonHolder
	{private final static Manager INSTANCE = new Manager();}

	public static Manager getInstance()
	{return SingletonHolder.INSTANCE;}
}
