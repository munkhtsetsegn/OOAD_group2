package lab6;

public class country {
        String countrynName= "mongolia";

  public country(String countrynName){
       this.countrynName = countrynName;
   }
    void displayy(){
        System.out.println("country: "+this.getCountrynName());
    }
    public String getCountrynName() {
        return countrynName;
    }

    public void setCountrynName(String countrynName) {
        this.countrynName = countrynName;
    }
}
