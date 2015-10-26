package raschet;
import java.util.Scanner;
import java.util.ArrayList;
import resurses.doctor;
import resurses.patient;

public class Raschet {
	public int colichDoctors;
	public int colichPatientov;
	
    public Raschet ( int colichDoctors, int colichPatientov){ 
    this.colichPatientov = colichPatientov;
    this.colichDoctors = colichDoctors;}
    
    public Raschet () {
        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
	    System.out.print("ColichD: ");
		this.colichDoctors=sc.nextInt();
		System.out.print("ColichP: ");
		this.colichPatientov=sc.nextInt();}
    
    public int getColichDoctors() {
  		return colichDoctors;
  	}

  	public void setColichDoctors(int colichDoctors) {
  		this.colichDoctors = colichDoctors;
  	}

  	public int getColichPatientov() {   //f
  		return colichPatientov;
  	}

  	public void setColichPatientov(int colichPatientov) {
  		this.colichPatientov = colichPatientov;
  	}
        
    public class Day{
    	
     private ArrayList <doctor> doctors = new ArrayList <doctor>();
    
	private ArrayList <patient> patients = new ArrayList <patient>();
	
	public ArrayList<doctor> getDoctors() { 
		return doctors;
	}

	@Override
	public String toString() {
		return "";
	}

	public void setDoctors(ArrayList<doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<patient> patients) {
		this.patients = patients;
	}

	public void addDoct( ) {
			 
			     doctor doct = new doctor();                                          
				this.doctors.add(doct);
		
				 }
	public void addPat( ) {
		 
	     patient pat = new patient();                                          
		this.patients.add(pat);}
    }
    
	public void Diag( )  {
		
	}
}
	

    

