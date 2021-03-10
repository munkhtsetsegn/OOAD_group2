package Daalgavar5;

public class Hotel {
	
	public int ID;
	public String Name;
	public String Address;
	public int pNumber;
	public String Roominfo;
	public String Order;
	public Hotel(int id, int pnumber, String name, String address, String roominfo, String order) {
		ID = id;
		Name = name;
		Address = address;
		pNumber = pnumber;
		Roominfo = roominfo;
		Order = order;
		
	}
	public double totalRent() {
		return 0;
	}
}