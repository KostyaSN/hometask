package get_set_ForPars;

public class Currency {

	private int id;
	private String name;
	private int code;
	private Double rate;
	private boolean visible;
	@Override
	public String toString() {
		return "\n"+"------------------------------------------"+"\n"
				+ name +
				" Id валюты =" + id + 
				" код валюты - " + code + 
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
