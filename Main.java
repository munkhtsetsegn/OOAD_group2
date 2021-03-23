
interface uls{
	public void china();
	public void russia();
	public void usa();
}

class Vacc implements uls {
	String name;
	int price;
	int gradus;
	String rules;
	
	Vacc(String name,	int price,	int gradus,	String rules){
	    this.name=name;
	    this.price=price;
	    this.gradus=gradus;
	    this.rules=rules;
	}
	public void print(){
	    System.out.System.out.println();
	}
}
class person{
    String name;
    Vacc vacc;
    public person(String name){
        this.name=name;
    }
    
    class Main {
	  public static void main(String[] args) {
	    Vacc china = new China("chn" , 50000, 21, "us hurehgu" );
	    Vacc russia = new rus("rus", 40000, -51, "huuhed bolohgu");
	    Vacc usa = new us("usa", 30000, 15, "hogshin bolohgu");
	    person a1 = new hun("bold");
	    person a2 = new hun("nergui"); 
	  }
    }
}
	 
