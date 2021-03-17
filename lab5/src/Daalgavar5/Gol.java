package Daalgavar5;

public class Gol {

	
		public static void main(String args[]){
			Hotel Hot = new Hotel(0256, 95011771,"HarTermes", "U", "Uvs nuuriin  ereg daguu , Best", "1");
			User Customer = new User(1234, "Mygmar", "Horloo", "horloo09@gmail.com", Hot, 771, null);
			NaturalBeauty Nat = new NaturalBeauty(7826, "Uvs nuur"," Mongoliin Hamgiin tom nuur");
			Route Road = new Route(7822, "ergiin daguu ");
			System.out.println(" Uzesgelent " + Nat.Name+ "iin " + Road.Name+ "  bairlah buudliin ner: "+ Customer.hotelOrder.Name);
			System.out.println( Customer.hotelOrder.Name + " buudliin dugaar: "+ Hot.ID);
            System.out.println("Hereglegchiin ner " + Customer.lName + "Hereglegchiin Route dugaar " + Road.ID );
			
		
	}

}
	