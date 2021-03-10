package lab5;

public class demo {
	public static void main(String args[]){
		Hotel Hatgal = new Hotel(0256, 85198417,"Hatgal", "Hatgal tosgon", "Howsgol dalain ereg daguu tsonhoor hamagdah haragdats hamgiin saitai, ereg ruugee alhahad oirhon, Sukhbaatar hologtei oirhon", "1");
		User Hereglegch = new User(6782, "Ulzii", "Nyamgerel", "unyamgerel7@gmail.com", Hatgal, 80553212, null);
		NaturalBeauty Natural = new NaturalBeauty(7826, "Howsgol nuur","Nayssss");
		Route Zam = new Route(7822, "shoroon ogsuur", "INFOOOOO");
		System.out.println("Baigaliin uzesgelent " + Natural.Name+ "iin " + Zam.Name+ " zam daguu bairlah buudliin ner: "+ Hereglegch.hotelOrder.Name);
		System.out.println( Hereglegch.hotelOrder.Name + " buudliin dugaar: "+ Hereglegch.hotelOrder.pNumber);

		
	}
}

