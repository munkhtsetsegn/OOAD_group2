package lab2;

import java.util.ArrayList;

class books{
	String name;
	String zohiogch;
	String torol;
	int huudas;
	public books(String name, String zohiogch) {
		this.name=name;
		this.zohiogch=zohiogch;
	}
	
	public void medeelel() {
		System.out.println(name + "nomnii zohiogch n" + zohiogch + "ym." );
	}
}
class Huuhdiin extends books{
	public Huuhdiin(String torol, String name, String zohiogch, int huudas) {
		super(name, zohiogch);
		this.torol=torol;
		this.huudas=huudas;
	}
	public void medeelel() {
		System.out.println(name + "nom n " + torol + "angilald baidag ba " + zohiogch + "zohiogchiin " + huudas + "huudastai nom bilee.");
	}
}
class zohiol extends books{
	public zohiol(String torol, String name, String zohiogch, int huudas) {
		super(name, zohiogch);
		this.torol=torol;
		this.huudas=huudas;
	}
	public void medeelel() {
			System.out.println(name + "nom n " + torol + "angilald baidag ba " + zohiogch + "zohiogchiin " + huudas + "huudastai nom bilee.");
	}	
} 
class science extends books{
	public science(String torol, String name, String zohiogch, int huudas) {
		super(name, zohiogch);
		this.torol=torol;
		this.huudas=huudas;
	}
	public void medeelel() {
		System.out.println(name + "nom n " + torol + "angilald baidag ba " + zohiogch + "zohiogchiin " + huudas + "huudastai nom bilee.");
	}
}
class gadaad extends books{
	public gadaad(String torol, String name, String zohiogch, int huudas) {
		super(name, zohiogch);
		this.torol=torol;
		this.huudas=huudas;
	}
	public void medeelel() {
		System.out.println(name + "nom n " + torol + "angilald baidag ba " + zohiogch + "zohiogchiin " + huudas + "huudastai nom bilee.");
	}
}

public class nomnuud{
	public static void main(final String[] args) {
		books a=new Huuhdiin("huuhdiin", "Maamuu", "Az", 20);
		books b=new Huuhdiin("huuhdiin", "Uulen ust", "Dawaasuren", 52);
		books c=new Huuhdiin("huuhdiin", "Minii tsagaan tolgoi", "Tsogzolmaa", 40);
		books d=new Huuhdiin("huuhdiin", "Nar", "Nar", 150);
		books e=new Huuhdiin("huuhdiin", "tsetseg", "Az", 30);
		
		books aa=new zohiol("zohiol", "Tuulain zurhten", "Altanhuyag", 230);
		books bb=new zohiol("zohiol", "Subeedei", "Turbat", 320);
		books cc=new zohiol("zohiol", "Zelme", "Turbat", 198);
		books dd=new zohiol("zohiol", "Tsagaan Uul", "Naranbat", 196);
		books ee=new zohiol("zohiol", "Huh nuur", "Bat", 211);
	
		books aaa=new science("science", "Human body", "Andrey", 432);
		books bbb=new science("science", "Animal", "Emily", 597);
		books ccc=new science("science", "Teeth", "Monica", 164);
		books ddd=new science("science", "biology", "William", 432);
		books eee=new science("science", "Geography", "Nanita", 432);
		
		books aaaa=new gadaad("gadaad", "Good earth", "Pearl", 132);
		books bbbb=new gadaad("gadaad", "Flash boys", "Lewis", 312);
		books cccc=new gadaad("gadaad", "Insurgent", "Roth", 212);
		books dddd=new gadaad("gadaad", "John green box sets", "John", 132);
		books eeee=new gadaad("gadaad", "The scorpio", "Maggie", 441);
		books f=new gadaad("gadaad", "Asher of London", "Taylor", 52);
		books g=new gadaad("gadaad", "Dear life", "Alice", 320);
		books h=new gadaad("gadaad", "Orange prize", "Robinson", 472);
		books i=new gadaad("gadaad", "Voice", "Elias", 92);
		books j=new gadaad("gadaad", "Good earth", "Pearl", 61);
		books k=new gadaad("gadaad", "MockingJay", "Suzzane", 432);
		books l=new gadaad("gadaad", "city", "Clara", 130);
		books m=new gadaad("gadaad", "Lost soul", "Cassandra", 342);
		books n=new gadaad("gadaad", "Mr.Mersedes", "Stephen", 330);
		books o=new gadaad("gadaad", "Good man", "King", 124);
		
		ArrayList<books> Object =new ArrayList<books>();
			Object.add(a);
			Object.add(b);
			Object.add(c);
			Object.add(d);
			Object.add(e);
			
			Object.add(aa);
			Object.add(bb);
			Object.add(cc);			
			Object.add(dd);
			Object.add(ee);
			
			Object.add(aaa);
			Object.add(bbb);
			Object.add(ccc);			
			Object.add(ddd);
			Object.add(eee);
			
			Object.add(aaaa);
			Object.add(bbbb);
			Object.add(cccc);			
			Object.add(dddd);
			Object.add(eeee);
			Object.add(f);
			Object.add(g);
			Object.add(h);
			Object.add(i);
			Object.add(g);
			Object.add(k);
			Object.add(l);
			Object.add(m);
			Object.add(n);
			Object.add(o);
			
		for(books z: Object) {
			z.medeelel();
		}
	}
}





