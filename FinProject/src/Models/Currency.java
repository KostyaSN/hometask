package Models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Currency {

	private int id;
	private String name;
	private int code;
	private Double rate;
	private List<String> typeList;
	private boolean visible;
	private SimpleDateFormat format;
	
	public List<String> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}

	public SimpleDateFormat getFormat() {
		return format;
	}

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}

	public Currency()
	{
		format = new SimpleDateFormat("yyyy-MM-dd");
		typeList = new ArrayList<String>();
	}
	
	@Override
	public String toString() {
		return "\n"+"------------------------------------------"+"\n"
				+ name +
				" Id валюты =" + id + 
				" код валюты- " + code + 
				" стоимость = " + rate + 
				" отображение = " + visible
				;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	
	
	
}
