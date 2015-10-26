package resurses;
import java.util.Scanner;


public class human {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + old;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		human other = (human) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (old != other.old)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	private String name;
	private String surname;
	private int old;
	
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
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	
	public human (String name, String surname, int old) {
		this.name = name;
		this.surname = surname;
		this.old = old;
	}
	@SuppressWarnings("resource")
	public human () {
        Scanner sc= new Scanner(System.in);
	    System.out.print("First name: ");
		this.name=sc.next();
		System.out.print("Second name: ");
		this.surname=sc.next();
		System.out.print(" Old: ");
		this.old=sc.nextInt();
		}
	public String toString(){
				return this.name+' '+this.surname;		}
}
