package laborator6;



public interface vaccine {
	public void vaccinfo();
	public void advice();

}
class World implements vaccine{
	vacc v;
	public World(vacc v) {
		this.v=v;
	}
	public void vaccinfo() {
		v.vaccinfo();
	}
	public void advice() {
		v.advice();
	}
}

class Information {
	public static void main(String[] args) {
		World agent= new World(new india());
		agent.vaccinfo();
	    
		World agentt= new World(new Russia());
		agentt.vaccinfo();
		agent.advice();
		
	}
	
}
class India implements vaccine {
	
	public void vaccinfo() {
		String fname=" ikheree";
		String Vname="india";
		int tempt = 4;
		
		System.out.println("Ner " + fname +"  " +"VaccineName" +Vname +"  "+ "hadgalalt:" +tempt );
	}
	public void advice(){
		System.out.println("vaccine hiilgesni daraa coffe uuj ,us hvrgej blhgvie ,darhlagaa demjh hergtei" );
		
	}
	
	
}

class Russia implements vaccine {
	
	public void vaccinfo() {
		String fname=" ikheree";
		String Vname="russia";
		int tempt = 3;
		
		System.out.println("Ner " + fname +"  " +"VaccineName" +Vname +"  "+ "hadgalalt:" +tempt );
	}
	public void advice(){
		System.out.println("vaccine hiilgesni daraa coffe uuj ,us hvrgej blhgvie ,darhlagaa demjh hergtei" );
		
	}
	
	

	
}


