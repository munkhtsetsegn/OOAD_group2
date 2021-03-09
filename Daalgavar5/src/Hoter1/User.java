package Hoter1;
import java.util.Date;

public class User {
	public int ID,PNumber; 
	public String fName, lName, EMail;
	public Hotel hotelOrder;
	public Date DOB;
	
	public User(int id, String fname, String lname, String email, Hotel hotel, int pnumber, Date dob ) {
		ID = id;
		fName = fname;
		lName = lname;
		EMail = email;
		hotelOrder = hotel;
		PNumber = pnumber;
		DOB = dob;
		System.out.println("user iin baiguulagch ajillaa");
	}
	public void verifyLogin() {
		
	}
	public void setName() {
		
	}
	public void verifyPassword() {
		
	}
}
