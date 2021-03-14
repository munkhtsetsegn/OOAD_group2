package lab5;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Route route=new Route(10,"Huvsgul ");
		Naturalbeuty n=new Naturalbeuty(10,"Khuvsgul","Lake ");
		Hotel h=new Hotel(10,"Az","khuvsgul",99110000,"lux","zahialga batalgaajiv");
		System.out.println(route.getName() + n.getInfo()+h.getOrder());
		User U=new User(10,"Namuun","O","o@gmail.com",h,99000000);
		 System.out.println("------------User Details----------");
		System.out.println("UserID "+ U.ID);
		System.out.println("Username "+ U.fName);
		System.out.println("Useremail "+ U.EMail);
		System.out.println("Userphonenum "+ U.PNumber);
		 System.out.println("------------Hotel Details----------");
		 System.out.println(U.hotelOrder.Name + "-d "+ U.fName + "nii"+  U.hotelOrder.Order);
	}

}
