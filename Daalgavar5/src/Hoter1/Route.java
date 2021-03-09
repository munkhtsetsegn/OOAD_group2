package Hoter1;

public class Route {
	public int ID;
	public String Name;
	public Hotel hotel = new Hotel(916, 87878787," BS", "haan negtei", "medkue", "1");
	public Natural_beauty Land = new Natural_beauty(2001, "Taiharchuluu","medkue");
	
	public Route(int id, String name) {
		ID = id;
		Name = name;
		System.out.println("Route iin baiguulagch ajillaa");
	}
}
