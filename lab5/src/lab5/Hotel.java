package lab5;

public class Hotel {
	public int ID;
	public int pNumber;
	public String Name;
	public String Address;
	public String Roominfo;
	public String Order;
	public Hotel(int id, int pnumber, String name, String address, String roominfo, String order) {
		ID = id;
		pNumber = pnumber;
		Name = name;
		Address = address;
		Roominfo = roominfo;
		Order = order;
		
	}
	public double totalRent() {
		return 0;
	}
}