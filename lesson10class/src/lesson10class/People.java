package lesson10class;

public class People/* implements Comparable<People>*/ {

	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
/*	public int compareTo(People o) {
		
		if(age == o.getAge() ){ return 0;
		}

		if(age < o.getAge() ){return -1;
		}
		
		return 1;
		
		return name.compareTo(o.getName());
		
	}*/
	
	

	
	}
