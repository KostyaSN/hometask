import java.util.ArrayList;
import java.util.Scanner;

import resurses.doctor;
import resurses.patient;
import raschet.Raschet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Raschet raschet = new Raschet ();
Raschet.Day day = raschet.new Day();

for (int i =0; i < raschet.getColichDoctors() ; i++){
	
System.out.println("Doctor#"+(i+1));
	day.addDoct();	
	System.out.println(day);
}
for (int i =0; i < raschet.getColichPatientov() ; i++){
	System.out.println("Patient#"+(i+1));
	day.addPat();	}	

Scanner sc= new Scanner(System.in);
sc.close();

     ArrayList <doctor> doctors = day.getDoctors();
     ArrayList <patient> patient = day.getPatients();
     
	for  (int i =0; i < raschet.getColichDoctors() ; i++){
		
		for (int j =0; j < raschet.getColichPatientov() ; j++){
           if (doctors.get(i).getDiagnoz().equalsIgnoreCase(patient.get(j).getDiagnaz())) {
        	   System.out.println("Patient "+patient.get(j).toString()+"- Doctor "+doctors.get(i).toString());  } ;
		}
	
		}
	}
}


