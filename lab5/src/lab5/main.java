package lab5;

public class main {
		public static void main(String args[]){
			Hotel Chinges = new Hotel(1111, 96209925,"Chinges", "dadal sum ", "Onon goliin  hoid tald ", "1");
			User cust = new User(04, "Ulzii", "Nyamgerel", "unyamgerel7@gmail.com", Chinges, 80553212, null);
			Naturalbeauty Natural = new Naturalbeauty(7826, "Onon gol","ih haanii tursun nutag");
			route zam = new route(001, "shoroon");
			System.out.println("baigaliin uzesgelent " + Natural.Name+ "iin " + zam.Name+ " zam daguu bairlah buudliin ner: "+ cust.hotelOrder.Name);
			System.out.println( cust.hotelOrder.Name + " buudliin dugaar: "+ cust.hotelOrder.pNumber);

			
		}
	}


