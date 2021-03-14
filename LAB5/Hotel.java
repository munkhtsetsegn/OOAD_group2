package lab5;


public class Hotel { 
	public int ID;
	public String Name;
	public String Address;
	public int PNum;
	public String Roominfo;
    public String Order;
	public void total() {
		System.out.println("total");
	}
	public Hotel(int iD, String name, String address, int pNum, String roominfo, String order) {
		ID = iD;
		Name = name;
		Address = address;
		PNum = pNum;
		Roominfo = roominfo;
		Order = order;
	}
	public String getOrder() {
		return Order;
	}
}
