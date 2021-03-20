package lab6;


class country {
    String countrynName = "mongolia, russia, china";

public country(String countrynName){
   this.countrynName = countrynName;
}
void display(){
    System.out.println("country: "+this.getCountrynName());
}
public String getCountrynName() {
    return countrynName;
}

public void setCountrynName(String countrynName) {
    this.countrynName = countrynName;
}
}
class people {
    String Lname;
    String Fname;
    boolean isMedicine=false;
    boolean isVaccine=false;
    String vaccineName;
    people() {

    }

    people(String Lname,String Fname,boolean isMedicine,boolean isVaccine,String vaccineName){
        this.Lname = Lname;
        this.Fname  = Fname;
        this.isMedicine = isMedicine;
        this.isVaccine = isVaccine;
        this.vaccineName = vaccineName;
    }
    public void print(){
        System.out.println("Ner: "+this.Lname+" "+ this.Fname);
        System.out.println("Ta taria hiilgesen uu: "+ this.isMedicine);
        System.out.println("Ta vaccine hiilgesen uu: "+ this.isVaccine);
        if(isVaccine)
            System.out.println("vaccine ii ner: "+ this.vaccineName);
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setMedicine(boolean medicine) {
        isMedicine = medicine;
    }

    public void setVaccine(boolean vaccine) {
        isVaccine = vaccine;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }
}
class medicine {
    String name;
    int une;
    String hugatsaa;
    String durem;

    medicine(String name,int une, String hugatsaa,String durem){
        this.name = name;
        this.une =une;
        this.hugatsaa= hugatsaa;
        this.durem= durem;
    }
    void medDisplay(){

        System.out.println("Ner: "+this.name);
        System.out.println("Une: "+this.une);
        System.out.println("storage degrees: "+this.hugatsaa);
        System.out.println("Durem: "+this.durem);
    }
    public String getRules() {
        return durem;
    }

    public int getPrice() {
        return une;
    }

    public String getName() {
        return name;
    }

    public String getStorageDegrees() {
        return hugatsaa;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRules(String durem) {
        this.durem = durem;
    }

    public void setPrice(int une) {
        this.une = une;
    }

    public void setStorageDegrees(String hugatsaa) {
        this.hugatsaa = hugatsaa;
    }
}
class Display {

    public static void main(String[] args) {
        Vaccine v1 = new Vaccine("mongolia","mongol2021",150000,"100c","deglem barih heregtei","no alcohol");
        Vaccine v2 = new Vaccine("russian","russian2021",200000,"50c","deglem barih heregtei","no alcohol");
        Vaccine v3 = new Vaccine("china","china2021",100000,"70c","deglem barih heregtei","no alcohol");
        v1.display();
        medicine m1 = new medicine("taria",100000,"70c","no alcohol");
        people [] obj = new people[10];
        int i=0;
        while(true){
            if(i==0){
                System.out.println("hereglegch oldsongui!");
            }else{
                for(int j=0;j<i;j++){
                    obj[j].print();
                    if(obj[j].isVaccine){
                        if(v1.getName().equals(obj[j].getVaccineName())) {
                            System.out.println("Zuvlumj: "+ v1.getAdvice());
                            System.out.println("Durem: " + v1.getRules());
                        }
                        else if(v2.getName().equals(obj[j].getVaccineName())) {
                            System.out.println("Zuvlumj: " + v2.getAdvice());
                            System.out.println("Durem: " + v2.getRules());
                        }
                        else {
                            System.out.println("Zuvlumj: " + v3.getAdvice());
                            System.out.println("Durem: " + v3.getRules());
                        }
                    }
                    else System.out.println("Durem: "+m1.getRules());

                    System.out.println("__!!!__");
                }
            }
            int sw=0;
            Scanner in = new Scanner(System.in);
            obj[i] = new people();
            System.out.println("Last Name: ");
            obj[i].setLname(in.nextLine());
            System.out.println(obj[i].getLname());
            System.out.println("First Name: ");
            obj[i].setFname(in.nextLine());
            System.out.println(obj[i].getFname());
            System.out.println(" taria bol: 1 vaccine bol: 2");
                    sw = in.nextInt();
                    switch (sw) {
                        case 1: obj[i].isMedicine=true ;
                            break;

                        case 2: obj[i].isVaccine = true;
                            break;
                        default: ;
                            break;
                    }
                    if(sw==2){
                        System.out.println("vaccine songono uu?");
                        System.out.println("____aaa____");
                        v1.displayy();
                        System.out.println("____bbb____");
                        v2.displayy();
                        System.out.println("____fff____");
                        v3.displayy();
                        switch(in.nextInt()){
                                case 1: obj[i].setVaccineName(v1.getName());
                                    break;
                                case 2:
                                    obj[i].setVaccineName(v2.getName());
                                    break;
                                case 3:
                                    obj[i].setVaccineName(v3.getName());
                                    break;
                                default:;
                                    break;
                        }
                    }
        i++;
        }
    }
}
public class vaccine extends country{
    String name;
    int une;
    String hugatsaa;
    String zuwluguu;
    String durem;

    vaccine(String countrynName,String name,int une, String hugatsaa,String zuwluguu,String durem){
        super(countrynName);
        this.name = name;
        this.une = une;
        this.hugatsaa= hugatsaa;
        this.zuwluguu = zuwluguu;
        this.durem= durem;
    }
     void display(){
         super.display();
         System.out.println("Ner: "+this.name);
         System.out.println("Une: "+this.une);
         System.out.println("zuwluguu: "+this.zuwluguu);
         System.out.println("storage degrees: "+this.hugatsaa);
         System.out.println("Durem: "+this.durem);
     }
    public String getRules() {
        return durem;
    }

    public int getPrice() {
        return une;
    }

    public String getAdvice() {
        return zuwluguu;
    }

    public String getName() {
        return name;
    }

    public String getStorageDegrees() {
        return hugatsaa;
    }

    public void setAdvice(String zuwluguu) {
        this.zuwluguu = zuwluguu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRules(String durem) {
        this.durem = durem;
    }

    public void setPrice(int une) {
        this.une = une;
    }

    public void setStorageDegrees(String hugatsaa) {
        this.hugatsaa = hugatsaa;
    }
}
