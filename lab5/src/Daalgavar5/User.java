package Daalgavar5;

import java.util.Date;

public class User {
	public int ID;
	public String fName;
	public String lName;
	public Date DOB;
	public String eMail;
	public int pNumber;
	public String Register;
	public Hotel hotelOrder; 
	
	public User(int id, String fname, String lname, String email, Hotel hotel, int pnumber, Date dob ) {
		ID = id;
		fName = fname;
		lName = lname;
		eMail = email;
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