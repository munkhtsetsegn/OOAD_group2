package Drama;

import java.util.Random; 

class drama  
{ 
    public String name; 
    public drama(String name) 
    { 
        this.name = name; 
    }
    public void setName(String name ){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

class narnii_vrsad extends drama{
     public narnii_vrsad(String name) 
    { 
        super(name); 
    }
      public String getName() 
    { 
        return super.getName(); 
    }
}
class  dream_high extends drama{
     public dream_high(String name) 
    { 
        super(name); 
    }
      public String getName() 
    { 
        return super.getName(); 
    }
}
class reply1988 extends drama{
     public reply1988 (String name) 
    { 
        super(name); 
    }
      public String getName() 
    { 
        return super.getName(); 
    }
}

class   true_beauty extends drama{
     public true_beauty(String name) 
    { 
        super(name); 
    }
      public String getName() 
    { 
        return super.getName(); 
    }
}

public class dramaa {
	public static void main(String []args){
        Random rand = new Random();
        for(int i=0;i<30;i++){
            switch(rand.nextInt(3)+1){
                case 1:
                    narnii_vrsad drama1  = new narnii_vrsad("Нарны үр сад драма");
                    System.out.println(drama1.getName());
                    break;
                case 2:
                    dream_high drama2 = new dream_high ("Мөрөөдлөөсч илүү драма");
                    System.out.println(drama2.getName());
                    break;
                case 3:
                    reply1988  drama3 = new reply1988 (" Дурсамж 1988 драма");
                    System.out.println(drama3.getName());
                    break;
                case 4:
                    true_beauty drama4 = new true_beauty ("Сахиусан тэнгэрийн нууц драма ");
                    System.out.println(drama4.getName());
                    break;
                
            }
        }
	}
}
