
public class DrugLine {
	private String id;
	private String dosage;
	private int numRefillsLeft;
	private int numRefillsTotal;
	
	//empty constructor
	public DrugLine() {
		
	}
	
	//overload constructor
	public DrugLine(String id, String dos, int numLeft, int numTotal) {
		this.id = id;
		this.dosage = dos;
		this.numRefillsLeft = numLeft;
		this.numRefillsTotal = numTotal;
	}

	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public int getNumRefillsLeft() {
		return numRefillsLeft;
	}

	public void setNumRefillsLeft(int numRefillsLeft) {
		this.numRefillsLeft = numRefillsLeft;
	}

	public int getNumRefillsTotal() {
		return numRefillsTotal;
	}

	public void setNumRefillsTotal(int numRefillsTotal) {
		this.numRefillsTotal = numRefillsTotal;
	}
	
	
}
