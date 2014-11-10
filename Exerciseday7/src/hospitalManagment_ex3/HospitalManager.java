package hospitalManagment_ex3;

public class HospitalManager {	
	 public static void main(String[] args) {
		 Patient philip = new Patient("Philip",50,"Lupus");
		 Patient patientList = philip;
		 Patient mark = new Patient("Mark",25,"Broken Leg");
		 patientList.addPatient(mark);
		 Patient carlos = new Patient("Carlos",35,"Fever");
		 patientList.addPatient(carlos);
		 Patient violet = new Patient("Violet",21,"TBC");
		 patientList.addPatient(violet);
		 Patient matilde = new Patient("Matilde",25,"Alcol Poisoning");
		 patientList.addPatient(matilde);
		 Patient alexandre = new Patient("Alexandre",34,"STD");
		 patientList.addPatient(alexandre);
		 Patient peter = new Patient("Peter",32,"Cluster Headache");
		 patientList.addPatient(peter);
		 Patient paul =  new Patient("Paul",45,"STD");
		 patientList.addPatient(paul);
		 Patient maria = new Patient("Maria",33,"Broken elbow");
		 patientList.addPatient(maria);
		 Patient anthony = new Patient("Anthony",19,"Hepatitis");
		 patientList.addPatient(anthony);
		 
		 Patient actualPatient = patientList;
		 while (actualPatient != null) {
		     System.out.println(actualPatient.showPatientInfo());
		     actualPatient = actualPatient.getNextPatient();
		 } 
		 
		 patientList.deletePatient(violet);
		 patientList.deletePatient(paul);
		 
	 }
}
