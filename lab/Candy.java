import java.util.*;

class Candies{
	String name;
	int calories;
	String sugar;
	int Fat;
	String type;
	public Candies(String name, int calories) {
		this.name = name;
		this.calories = calories;
		
	}
	public void pr() {
		System.out.println("name: " + name + " Calories: " + calories);
	}
}
class BonBons extends Candies{
	public BonBons(String type, String name, int calories, String sugar, int Fat) {
		super(name, calories);
		this.sugar = sugar;
		this.Fat = Fat;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tCalories: " + calories + "\tSugar: " + sugar + "\tFat: " + Fat);
	}
}

class Caramels extends Candies{
	public Caramels(String type, String name, int calories, String sugar, int Fat) {
		super(name, calories);
		this.sugar = sugar;
		this.Fat = Fat;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tCalories: " + calories + "\tSugar: " + sugar + "\tFat: " + Fat);
	}
}
class CandyBars extends Candies{
	double protein;
	public CandyBars(String type, String name, int calories, String sugar, int Fat, double protein) {
		super(name, calories);
		this.sugar = sugar;
		this.Fat = Fat;
		this.type = type;
		this.protein = protein;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tCalories: " + calories + "\tSugar: " + sugar + "\tFat: " + Fat + "\tprotein: " + protein);
	}
}
public class Candy{
	public static void main(String[] args) {
		Candies a = new BonBons("BonBons", "Arcor Crystal", 60, "13g", 0);
		Candies c = new BonBons("BonBons", "Cedrinca Fruit", 170, "35g", 0);
		Candies d = new BonBons("BonBons", "Arcor honey", 50, "9g", 0);
		Candies e = new BonBons("BonBons", "Rendez Vous", 47, "11g", 0);
		Candies f = new Caramels("Caramels", "Foiled Caramel Candy - Light", 33, "5g", 0);
		Candies g = new Caramels("Caramels", "Foiled Caramel Candy - Navy", 31, "3g", 0);
		Candies h = new Caramels("Caramels", "Foiled Caramel Candy - White", 29, "7g", 0);
		Candies i = new Caramels("Caramels", "Foiled Caramel Candy - Blue", 34, "9g", 0);
		Candies j = new CandyBars("CandyBars", "Snickers", 280, "30g", 14, 4);
		Candies k = new CandyBars("CandyBars", "Twix", 230, "19g", 11, 2);
		Candies l = new CandyBars("CandyBars", "Bounty", 210, "30g", 17, 3);
		Candies m = new CandyBars("CandyBars", "Mars", 230, "60g", 17, 4.3);
		ArrayList<Candies> Candy = new ArrayList<Candies>();
		Candy.add(a);
		Candy.add(c);
		Candy.add(d);
		Candy.add(e);
		Candy.add(f);
		Candy.add(g);
		Candy.add(h);
		Candy.add(i);
		Candy.add(j);
		Candy.add(k);
		Candy.add(l);
		Candy.add(m);
		for(Candies b:Candy) {
			b.pr();
		}
	}
}