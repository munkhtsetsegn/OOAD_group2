
public class User{
    public int id;
    public String fName;
    public String lName;
    public int DOB;
    public String Email;
    public int Pnumber;
    public String resigter;
    public String hotelOrder;
    
    User(int id, String fName, String lName, int DOB, String Email
    int Pnumber, String resigter, String hotelOrder){
        this.id=id;
        this.fName=fName;
        this.lName=lName;
        this.DOB=DOB;
        this.Email=Email;
        this.Pnumber=Pnumber;
        this.resigter=resigter;
        this.hotelOrder=hotelOrder;
    }
    
    public static void main(String[] args) {
    verifyLogin();
    setName();
    VerifyPassword();
  }
}


public class Hotel {
    public int id;
    public String name;
    public String address;
    public int pnumber;
    public String roominfo;
    public String order;
    
    Hotel(int id, String name, String address, int pnumber, 
        String roominfo, String order){
            this.id=id;
            this.name=name;
            this.address=address;
            this.pnumber=pnumber;
            this.roominfo=roominfo;
            this.order=order;
        }
    List<User>users;
    Hotel(){
        user= new ArrayList<user>()
    }
    class Route(){
        List<Hotel>hotel;
    }
    
    public static void main(String[] args) {
    totalRent();
  }
}
users.add(new user);


public class Route(){
    public int id;
    public String name;
    Route(int id, String name){
        this.id=id;
        this.name=name;
    }
}

public class NaturalBeauty(){
    public int id;
    public String name; 
    public String info;
     NaturalBeauty(int id, String name; String info){
        this.id=id;
        this.name=name;
        this.info=info;
     }
     
     class Route(){
         List<NaturalBeauty>NB;
     }
}
    
    
    
    
    
