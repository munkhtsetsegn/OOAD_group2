package Hoter1;

public class Dome {
	public static void main(String args[]){
		Hotel BS = new Hotel(916, 87878787," BS", "haan negtei", "medkue", "1");
		User U = new User(0512, "Tseke", "Nymka", "tsekenyamka@gmail.com", BS, 88880808, null);
//		Natural_beauty L = new Natural_beauty(2001, "Taiharchuluu","medkue");
//		Route R = new Route(4321, "gurvaljin");
		System.out.println("usertei hamgiin oirhon baigaa buudaliin ner: "+ U.hotelOrder.Name);
		System.out.println( U.hotelOrder.Name + " buudaliin dugaar: "+ U.hotelOrder.pNumber);
	}
}
