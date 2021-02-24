package basic;

public class ShinjlehUhaan extends Nom {
	String Ner;
	ShinjlehUhaan(String Ner){
		this.Ner=Ner;
		type = "ShinjlehUhaanii nom";
	}
	public void printInfo(){
		System.out.println("Ner: " + Ner + " "+ "Type: " + type);
	}
}
