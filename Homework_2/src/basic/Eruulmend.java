package basic;

public class Eruulmend extends Nom{
	String Ner;
	Eruulmend(String Ner){
		this.Ner=Ner;
		type = "Eruulmendiin nom";
	}
	public void printInfo(){
		System.out.println("Ner: " + Ner + " "+ "Type: " + type);
	}
}
