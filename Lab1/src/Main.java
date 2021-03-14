import java.util.*;
public class Main {
	public static void main(String args[]) {
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new AdventureMovie(101, "The NAN", 1910 ));
		movies.add(new AdventureMovie(102, "The NUN", 1920 ));
		movies.add(new AdventureMovie(103, "The sda", 1930 ));
		movies.add(new AdventureMovie(104, "The NIN", 1940 ));
		movies.add(new AdventureMovie(105, "The taxi", 1950 ));
		movies.add(new AdventureMovie(106, "Fast speed", 1960 ));
		movies.add(new AdventureMovie(107, "Train to busan", 1970 ));
		movies.add(new ComedyMovie(201, "Comedy", 2));
		movies.add(new ComedyMovie(201, "big mama", 5));
		movies.add(new ComedyMovie(201, "Speeds", 10));
		movies.add(new ComedyMovie(201, "White chicks", 5));
		movies.add(new ComedyMovie(201, "Polices", 6));
		movies.add(new ComedyMovie(201, "This is me", 1));
		movies.add(new ComedyMovie(201, "Hoho", 0));
		movies.add(new ComedyMovie(201, "Haha", 10));
		movies.add(new ComedyMovie(201, "Blabla", 9));
		movies.add(new HorrorMovie(301,"Conjuring", 18));
		movies.add(new HorrorMovie(301,"The nun", 21));
		movies.add(new HorrorMovie(301,"Yaduugin zowlon", 21));
		movies.add(new HorrorMovie(301,"168", 18));
		movies.add(new HorrorMovie(301,"Final distance", 13));
		movies.add(new HorrorMovie(301,"Wrong turn", 22));
		movies.add(new HorrorMovie(301,"It", 19));
		movies.add(new HorrorMovie(301,"The visit", 10));
		movies.add(new HorrorMovie(301,"The hunt", 19));
		movies.forEach((item)->{
			System.out.println(item.toString());
		});
	}
}
