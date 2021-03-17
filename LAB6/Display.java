package lab6;
import java.util.Scanner;

public class Display {


    public static void main(String[] args) {
        Vaccine v1 = new Vaccine("Mongolia","mongol2021",150000,"100c","deglem barih heregtei","no alcohol");
        Vaccine v2 = new Vaccine("Russian","Russian2021",200000,"50c","deglem barih heregtei","no alcohol");
        Vaccine v3 = new Vaccine("French","French2021",100000,"70c","deglem barih heregtei","no alcohol");
        v1.displayy();
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

