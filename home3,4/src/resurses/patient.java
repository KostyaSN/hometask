package resurses;
import java.util.Scanner;

public class patient extends human{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((diagnaz == null) ? 0 : diagnaz.hashCode());
		result = prime * result + ((pains == null) ? 0 : pains.hashCode());
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
		patient other = (patient) obj;
		if (diagnaz == null) {
			if (other.diagnaz != null)
				return false;
		} else if (!diagnaz.equals(other.diagnaz))
			return false;
		if (pains == null) {
			if (other.pains != null)
				return false;
		} else if (!pains.equals(other.pains))
			return false;
		return true;
	}
	private String pains;
	public String diagnaz;

	public String getDiagnaz() {
		return diagnaz;
	}

	public void setDiagnaz(String diagnaz) {
		this.diagnaz = diagnaz;
	}

	public String getPains() {
		return pains;
	}

	public void setPains(String pains) {
		this.pains = pains;
	}

	@SuppressWarnings("unused")
	private patient ( String name, String surname, int old, String pains, String diagnoz, String diagnaz) {
		super.setName(name);
		super.setSurname(surname);
		super.setOld(old); 
		this.pains =pains;
		this.diagnaz = diagnaz;}
	@SuppressWarnings("resource")
	public patient ( ) {
	       super ();
			Scanner sc= new Scanner(System.in);
			System.out.print("Pain: ");
			this.pains=sc.next();
			System.out.print("Diagnaz: ");
			this.diagnaz=sc.next();
    }
	
}
