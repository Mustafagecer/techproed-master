 package hospital;

public class Dummy {

	public static void main(String[] args) {
	
		Patient patient =new Patient();
		patient.setName("ali");
		patient.setLastname("veli");
		patient.setPatientId(202);
		
		Case case1=new Case();
		case1.setActualCase("Java");
		case1.setEmergency(true);
		
		patient.setPatientCase(case1);
		
		Doctor doctor=new Doctor();
		doctor.setName("Elanur");
		doctor.setLastname("Selcuk");
		doctor.setTitle("Pediatrican");
		
		
		Hospital hospital=new Hospital();
		hospital.setDoctor(doctor);
		hospital.setPatient(patient);
		
		System.out.println(hospital);
		
		
		
		
	}

}
