
public class Prescription {
	private String id;
	private DrugLine lineOfDrug;
	private Pharmacist pharma;
	
	//empty constructor
	public Prescription() {
		
	}
	
	//overload constructor
	public Prescription(String iD, DrugLine loD, Pharmacist ph) {
		this.id = iD;
		this.lineOfDrug = loD;
		this.pharma = ph;
	}

	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DrugLine getLineOfDrug() {
		return lineOfDrug;
	}

	public void setLineOfDrug(DrugLine lineOfDrug) {
		this.lineOfDrug = lineOfDrug;
	}

	public Pharmacist getPharma() {
		return pharma;
	}

	public void setPharma(Pharmacist pharma) {
		this.pharma = pharma;
	}
	
	
}
