import java.util.*;


public class Doctor {
	private String name;
	private String address;
	private String phone;
	private String spezialization;
	private HashMap<String, Integer> watchlist = new HashMap<String, Integer>();
	
	//empty constructor
	public Doctor() {
		
	}
	
	//overload constructor
	public Doctor(String n, String add, String ph, String spezi, HashMap<String, Integer> list) {
		this.name = n;
		this.address = add;
		this.phone = ph;
		this.spezialization = spezi;
		this.watchlist = list;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpezialization() {
		return spezialization;
	}

	public void setSpezialization(String spezialization) {
		this.spezialization = spezialization;
	}

	public HashMap<String, Integer> getWatchlist() {
		return watchlist;
	}

	public void setWatchlist(HashMap<String, Integer> watchlist) {
		this.watchlist = watchlist;
	}
	
}
