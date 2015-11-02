package Models;

import java.util.Date;
import java.util.List;

public class Root {

	private String bankName;
	private String bankLocation;
	private Date date;
	private int baseCurrencyId;
	private List<Currency> currency;
	@Override
	public String toString() {
		return "�������� �����: " + bankName + "\n"+ "������������ �����: " + bankLocation + "\n"+ "���� ������: " + date + "\n"+ "��������������� ����� �����: "
				+ baseCurrencyId + "\n"+ "������: " + currency ;
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
	public int getBaseCurrencyId() {
		return baseCurrencyId;
	}
	public void setBaseCurrencyId(int baseCurrencyId) {
		this.baseCurrencyId = baseCurrencyId;
	}
	public List<Currency> getCurrency() {
		return currency;
	}
	public void setCurrency(List<Currency> currency) {
		this.currency = currency;
	}
	
	
	
	
	
	
	
}
