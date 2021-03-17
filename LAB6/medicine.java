package lab6;

public class medicine {
    String name;
    int price;
    String StorageDegrees;
    String rules;

    medicine(String name,int price, String StorageDegrees,String rules){
        this.name = name;
        this.price =price;
        this.StorageDegrees= StorageDegrees;
        this.rules= rules;
    }
    void medDisplay(){

        System.out.println("Ner: "+this.name);
        System.out.println("Une: "+this.price);
        System.out.println("storage degrees: "+this.StorageDegrees);
        System.out.println("Durem: "+this.rules);
    }
    public String getRules() {
        return rules;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getStorageDegrees() {
        return StorageDegrees;
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
