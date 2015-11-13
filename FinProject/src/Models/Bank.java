package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bank {

	private String bankName;
	private String bankLocation;
	private Date date;
	private String baseCurrencyId;
	private List<Currency> currency;
	
	
	public Bank()
	{
		currency = new ArrayList<Currency>();
	}
	
	public String toString() {
		return "Название банка: " + bankName + "\n"+ "Расположение банка: " + bankLocation + "\n"+ "Дата данных: " + date + "\n"+ "Индификациооный номер банка: "
				+ baseCurrencyId + "\n"+ "Валюты: " + currency ;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBaseCurrencyId() {
		return baseCurrencyId;
	}
	public void setBaseCurrencyId(String string) {
		this.baseCurrencyId = string;
	}
	public List<Currency> getList() {
		return currency;
	}
	public void setList(Currency currenc) {
		this.currency.add(currenc);
	}
	
	
	
	
	
	
}
