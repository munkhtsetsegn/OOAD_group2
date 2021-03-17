package lab6;




class Gol{
	public static void main(String[] args) {
		Uildel myObj= new Uildel(new Russia());
		
		
		
		myObj.zuvluguu();
		myObj.hadgalalt();
		Uildel myObj1= new Uildel(new China());
		
		myObj1.zuvluguu();
		myObj1.hadgalalt();
		
		Uildel myObj2= new Uildel(new USA());
		
		myObj2.zuvluguu();
		myObj2.hadgalalt();
		
	}
	
}
public interface Vaktsin {
	public void hadgalalt();
	public void zuvluguu();

}
class Russia implements Vaktsin{
	
	public void hadgalalt() {
		String firstname="Bold";
		String name="sputnik";
		String durem="Harshiltai hun hereglej bolohgui";
		int price=120000;
		int gradus=7;
		
		System.out.println("Taria hiilgesen hunii ner:" + firstname +"  " +"Vaktsinii ner:" +name +" "+ "Vaktsinii Une:" +price +" "+ " Emchilgeenii durem:" +durem );
	}
	public void zuvluguu(){
		System.out.println("Zovlogoo: Vaktsin hiilgesniihee daraa tolgoi ergene tiimees sandrah hereggui ene bol heviin uzegdel");
		
	}
	
	
}

class China implements Vaktsin{
	
	public void hadgalalt() {
		String firstname="Badamtsetseg";
		String name="Sinopharm";
		String durem="2 udaa tariulna";
		int price=140000;
		int gradus=6;

		
		System.out.println("Taria hiilgesen hunii ner:" + firstname +"  " +"Vaktsinii ner:" +name +" "+ "Vaktsinii Une:" +price +" "+ " Emchilgeenii durem:" +durem );
	}
	public void zuvluguu(){
		System.out.println("Zovlogoo: 2 udaa hiilgene " );
		
	}
	
}
class USA implements Vaktsin{
	
	public void hadgalalt() {
		String firstname="Bataa";
		String name="Prizer";
		String durem="Omnon covid tussan hun hereglehgui";
		int price=100000;
		int gradus=5;
		
		System.out.println("Taria hiilgesen hunii ner:" + firstname +"  " +"Vaktsinii ner:" +name +" "+ "Vaktsinii Une:" +price +" "+ " Emchilgeenii durem:" +durem );
	}
	public void zuvluguu(){
		System.out.println("Zovlogoo: Harshiltai bol hereglehgui" );
	}
	
}
class Uildel implements Vaktsin{
	Vaktsin vak;
	public Uildel(Vaktsin vak) {
		this.vak=vak;
	}
	public void hadgalalt() {
		vak.hadgalalt();
	}
	public void zuvluguu() {
		vak.zuvluguu();
	}
}


