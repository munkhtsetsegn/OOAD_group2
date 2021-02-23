package lab2;
import java.util.*;

public class Kino{

    String name;
    public Kino(String name) {
        this.name=name;
    }
    public void pr() {
        // This constructor has one parameter, name.
        System.out.println("aldartai kinonii ners: " + name );
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	Kino Quantum_Physics = new Quantum_Physics("Quantum Physics");
    	Kino Lake_house = new Lake_house("Lake house");
    	Kino Nocturne = new Nocturne("Nocturne");
    	Kino The_Mortuary_Collection = new The_Mortuary_Collection("The Mortuary Collection");
    	Kino The_Devil_All_the_Time = new The_Devil_All_the_Time("The Devil All the Time");
    	Kino Secret_Zoo = new Secret_Zoo("Secret Zoo");
    	Kino Me_and_Me = new Me_and_Me("Me and Me");
    	Kino Peninsula = new Peninsula("Peninsula");
    	Kino One_Days = new One_Days("One Day");
    	Kino Start_Up = new Start_Up("Start Up");
    	Kino Onward = new Onward("Onward");
    	Kino Fantasy_Island = new Fantasy_Island("Fantasy Island");
    	Kino The_Informer = new The_Informer("The Informer");
    	Kino Yesterday = new Yesterday("Yesterday");
    	Kino Ready_Player_One = new Ready_Player_One("Ready Player One" );
    	Kino Tokyo_Ghoul = new Tokyo_Ghoul("Tokyo Ghoul");

        ArrayList<Kino> al = new ArrayList<Kino>();
        al.add(Quantum_Physics);//Киноны обьектыг нэмэх
        al.add(Lake_house);
        al.add(Nocturne);
        al.add(The_Mortuary_Collection);
        al.add(The_Devil_All_the_Time);
        al.add(Secret_Zoo);
        al.add(Me_and_Me);
        al.add(Peninsula);
        al.add(One_Days);
        al.add(Start_Up);
        al.add(Onward);
        al.add(Fantasy_Island);
        al.add(The_Informer);
        al.add(Yesterday);
        al.add(Ready_Player_One);
        al.add(Tokyo_Ghoul);
        al.forEach(Kino::pr);

    }

}
class Quantum_Physics extends Kino{

    public Quantum_Physics(String name) {
        super(name);
   
    }

    public void pr() {
        // This constructor has one parameter, name.
        System.out.println("Tuuhen barimtat kino: " + name );
    }


}
class Lake_house extends Kino{

    int vnelgee;
    public Lake_house(String name) {
        super(name);

    }

    public void pr() {
        // This constructor has one parameter, name.
        System.out.println("Tuuhen barimtat kino: " + name );
    }


}

class Nocturne extends Kino{

  
    public Nocturne(String name) {
        super(name);
 

    }
    public void pr() {
        // This constructor has one parameter, name.
        System.out.println("Olon angit kino: " + name );
    }


}
class The_Mortuary_Collection extends Kino{

    public The_Mortuary_Collection(String name) {
        super(name);
       

    }

    public void pr() {
        // This constructor has one parameter, name.
        System.out.println("Olon angit kino: " + name );
    }


}
class The_Devil_All_the_Time extends Kino{

    public The_Devil_All_the_Time(String name) {
        super(name);
    }

    public void pr() {
        // This constructor has one parameter, name.
        System.out.println("Huuheldein kino: " + name );
    }


}

class Secret_Zoo extends Kino{


    public Secret_Zoo(String name) {
        super(name);

    }
    public void pr() {
        // This constructor has one parameter, name.
        System.out.println("Huuheldein kino kino: " + name );
    }
}

class Me_and_Me extends Kino{
	

	public Me_and_Me(String name) {
		super(name);
	}
	public void pr() {
	System.out.println("Adal yvdalt kino: " + name);
	}
}
class Peninsula extends Kino{
	
	public Peninsula(String name) {
		super(name);
	}
	public void pr() {
	System.out.println("Aimshgiin kino: " + name);
	}
}
class One_Days extends Kino{
	
	public One_Days(String name) {
		super(name);
	}
	public void pr() {
	System.out.println("Adal yvdalt kino: " + name);
	}
}
class Start_Up extends Kino{
	
	public Start_Up(String name) {
		super(name);
	}
	public void pr() {
	System.out.println("Olon angit kino: " + name);
	}
}
class Onward extends Kino{
	

	public Onward(String name) {
		super(name);
	}
	public void pr() {
	System.out.println("Adal yvdalt kino: " + name);
	}
}
class Fantasy_Island extends Kino{
	
	public Fantasy_Island(String name) {
		super(name);
	}
	public void pr() {
	System.out.println("Ineedmiin kino: " + name);
	}
}
class The_Informer extends Kino{
	
	
	public The_Informer(String name) {
		super(name);
	
	}
	public void pr() {
	System.out.println("Ineedmiin kino: " + name);
	}
}
class Yesterday extends Kino{
	
	
	public Yesterday(String name) {
		super(name);
		
	}
	public void pr() {
	System.out.println("Uyangiin romantic kino: " + name);
	}
}
class Ready_Player_One extends Kino{
	
	
	public Ready_Player_One(String name) {
		super(name);
	
	}
	public void pr() {
	System.out.println("Ineedmiin kino: " + name);
	}
}
class Tokyo_Ghoul extends Kino{
	
	public Tokyo_Ghoul(String name) {
		super(name);
		
	}
	public void pr() {
	System.out.println("Adal yvdalt kino: " + name);
	}
}

