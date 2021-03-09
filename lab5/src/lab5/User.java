package lab5;
import java.util.Date;

public class User {
	public int ID;
	public int pNumber;
	public String fName;
	public String lName;
	public String EMail;
	public Hotel hotelOrder;
	public Date DOB;
	
	public User(int id, String fname, String lname, String email, Hotel hotel, int pnumber, Date dob ) {
		ID = id;
		fName = fname;
		lName = lname;
		EMail = email;
		hotelOrder = hotel;
		pNumber = pnumber;
		DOB = dob;
		
	}
	public void verifyLogin() {
		
	}
	public void setName() {
		
	}
	public void verifyPassword() {
		
	}
}