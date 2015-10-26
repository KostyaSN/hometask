
package resurses;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class doctor extends human{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((diagnoz == null) ? 0 : diagnoz.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		doctor other = (doctor) obj;
		if (diagnoz == null) {
			if (other.diagnoz != null)
				return false;
		} else if (!diagnoz.equals(other.diagnoz))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		return true;
	}


	private String doctor;
	public String diagnoz;
	public SimpleDateFormat date;
	

	public SimpleDateFormat getDate() {
		return date;
	}

	public void setDate(SimpleDateFormat date) {
		this.date = date;
	}

	public String getDiagnoz() {
		return diagnoz;
	}

	public void setDiagnoz(String diagnoz) {
		this.diagnoz = diagnoz;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public doctor ( String name, String surname, int old, String doctor, String diagnoz, SimpleDateFormat date) {
		super.setName(name);
		super.setSurname(surname);
		super.setOld(old);
			this.doctor =doctor;
			this.diagnoz = diagnoz;
			this.date = date;
			
		}
	
	
	@SuppressWarnings("resource")
	public doctor ( ) {
		        super ();
				Scanner sc= new Scanner(System.in);
				System.out.print("Доктор: ");
				this.doctor=sc.next();
				System.out.print("Диагноз: ");
				this.diagnoz=sc.next();
				System.out.print("Дата рождения: ");
				
				}
	}
