package lesson11class;

public class myElement {

	private int age;
	private int id;
	private boolean isDegree;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Element [age=" + age + ", id=" + id + ", isDegree=" + isDegree + ", name=" + name + ", surname="
				+ surname + "]";
	}
	public boolean isDegree() {
		return isDegree;
	}
	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	private String name;
	private String surname;

	
}
