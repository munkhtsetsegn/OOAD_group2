package basic;

public class Uranzohiol extends Nom {
	String Ner;
	Uranzohiol(String Ner){
		this.Ner=Ner;
		type = "Uranzohioliin nom";
	}
	public void printInfo(){
		System.out.println("Ner: " + Ner + " "+ "Type: " + type);
	}
}
