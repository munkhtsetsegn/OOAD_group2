package lab6;

public class people {
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
        System.out.println("Ta vaccin hiilgesen uu: "+ this.isVaccine);
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
