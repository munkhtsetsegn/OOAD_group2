package inter;

public interface Wakk {
	public void dataBase();
	public void zuwluguu();

}
class Russia implements Wakk{
	
	public void dataBase() {
		String firstname="Bold";
		String name="Russia";
		int price=120000;
		int gradus=2;
		
		System.out.println("FIRSTNAME:" + firstname +"  " +"NAME:" +name +" "+ "PRICE:" +price +" "+ "GRADUS:" +gradus );
	}
	public void zuwluguu(){
		System.out.println("ZUWLUGUU: 1.Garaa ugaah; 2. Maskaa zvvh; 3. Zaigaa barih" );
		
	}
	
	
}

class China implements Wakk{
	
	public void dataBase() {
		String firstname="Tomy";
		String name="China";
		int price=140000;
		int gradus=4;

		
		System.out.println("FIRSTNAME:" + firstname+"  " +"NAME:" +name +" "+ "PRICE:" +price + " "+ "GRADUS:" +gradus );
	}
	public void zuwluguu(){
		System.out.println("ZUWLUGUU: 1.Garaa ugaah; 2. Maskaa zvvh; 3. Zaigaa barih" );
		
	}
	
}
class USA implements Wakk{
	
	public void dataBase() {
		String firstname="Bataa";
		String name="USA";
		int price=100000;
		int gradus=0;
		
		System.out.println("FIRSTNAME:" + firstname+"  " + "NAME:" +name +"  "+ "PRICE:" +price+"  " + "GRADUS:" +gradus );
	}
	public void zuwluguu(){
		System.out.println("ZUWLUGUU: 1.Garaa ugaah; 2. Maskaa zvvh; 3. Zaigaa barih" );
	}
	
}
class World implements Wakk{
	Wakk w;
	public World(Wakk w) {
		this.w=w;
	}
	public void dataBase() {
		w.dataBase();
	}
	public void zuwluguu() {
		w.zuwluguu();
	}
}

class DelegationImpormation {
	public static void main(String[] args) {
		World agent= new World(new Russia());
		agent.dataBase();
	    
		World agentt= new World(new China());
		agentt.dataBase();
		agent.zuwluguu();
		
	}
	
}

