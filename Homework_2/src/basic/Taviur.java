package basic;

import java.util.Scanner;

public class Taviur {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Uranzohiol u = new Uranzohiol(in.next());
		ShinjlehUhaan s = new ShinjlehUhaan(in.next());
		Eruulmend e = new Eruulmend(in.next());
		System.out.println( "Taviur deer baigaa nomnuud: ");
		u.printInfo();
		s.printInfo();
		e.printInfo();
	}
}
