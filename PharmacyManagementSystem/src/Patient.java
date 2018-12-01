
public class Patient {
	private String name;
	private String ssn;
	private String phone;
	private String insurance;
	
	//empty constructor
	public Patient() {
		
	}
	
	//overload constructor
	public Patient(String name, String ssn, String ph, String ins) {
		this.name = name;
		this.ssn = ssn;
		this.phone = ph;
		this.insurance = ins;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	
}
