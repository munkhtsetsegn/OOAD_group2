package Hoter1;

public class Hotel {
	public int ID, pNumber;
	public String Name, Address, Roominfo, Order;
	public Hotel(int id, int pnumber, String name, String address, String roominfo, String order) {
		ID = id;
		pNumber = pnumber;
		Name = name;
		Address = address;
		Roominfo = roominfo;
		Order = order;
		System.out.println("Hotel iin baiguulagch ajillaa");
	}
	public double totalRent() {
		return 0;
	}
}
