
public class Pharmacist {
	private String name;
	private String ssn;
	private String certDate;
	
	//empty constructor
	public Pharmacist() {
		
	}
	
	//overload constructor
	public Pharmacist(String n, String s, String date) {
		this.name = n;
		this.ssn = s;
		this.certDate = date;
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

	public String getCertDate() {
		return certDate;
	}

	public void setCertDate(String certDate) {
		this.certDate = certDate;
	}
	
	
}
