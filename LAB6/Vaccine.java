package lab6;
public class Vaccine extends country{
    String name;
    int price;
    String StorageDegrees;
    String advice;
    String rules;

    Vaccine(String countrynName,String name,int price, String StorageDegrees,String advice,String rules){
        super(countrynName);
        this.name = name;
        this.price =price;
        this.StorageDegrees= StorageDegrees;
        this.advice = advice;
        this.rules= rules;
    }
     void displayy(){
         super.displayy();
         System.out.println("Ner: "+this.name);
         System.out.println("Une: "+this.price);
         System.out.println("advice: "+this.advice);
         System.out.println("storage degrees: "+this.StorageDegrees);
         System.out.println("Durem: "+this.rules);
     }
    public String getRules() {
        return rules;
    }

    public int getPrice() {
        return price;
    }

    public String getAdvice() {
        return advice;
    }

    public String getName() {
        return name;
    }

    public String getStorageDegrees() {
        return StorageDegrees;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStorageDegrees(String storageDegrees) {
        StorageDegrees = storageDegrees;
    }
}

