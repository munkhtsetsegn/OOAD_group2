package lab5;

public class User {
	public int ID,PNumber; 
	public String fName, lName, EMail, Register;
	public Hotel hotelOrder;
	
	
	
	public User(int id, String fname, String lname, String email, Hotel hotel, int pnumber ) {
		ID = id;
		fName = fname;
		lName = lname;
		EMail = email;
		hotelOrder = hotel;
		PNumber = pnumber;
	}
	public void verifyLogin() {
		
	}
	public void setName() {
		
	}
	public void verifyPassword() {
		
	}
}
