import java.util.*;


public class Drug {
	private String name;
	private ArrayList<String> ingredients;
	private String manufacturer;
	private ArrayList<String> conditions;
	private ArrayList<String> contraindications;
	
	//empty constructor
	public Drug() {
		
	}
	
	//overload constructor
	public Drug(String name, ArrayList<String> ing, String manu, ArrayList<String> condi, ArrayList<String> contrain) {
		this.name = name;
		this.ingredients = ing;
		this.manufacturer = manu;
		this.conditions = condi;
		this.conditions = contrain;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public ArrayList<String> getConditions() {
		return conditions;
	}

	public void setConditions(ArrayList<String> conditions) {
		this.conditions = conditions;
	}

	public ArrayList<String> getContraindications() {
		return contraindications;
	}

	public void setContraindications(ArrayList<String> contraindications) {
		this.contraindications = contraindications;
	}
	
	
	
}
