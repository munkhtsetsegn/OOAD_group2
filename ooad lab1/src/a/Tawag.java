package a;
import java.util.Scanner;

public class Tawag {
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			ChocoChiher Choco = new ChocoChiher(in.next());
			ChomogteiChiher Chomog = new ChomogteiChiher(in.next());
			OwiyostoiChiher Owiyos = new OwiyostoiChiher(in.next());
			System.out.println("tawgand bga chihernuud: ");
			Choco.printInfo();
			Chomog.printInfo();
			Owiyos.printInfo();
			}
}
