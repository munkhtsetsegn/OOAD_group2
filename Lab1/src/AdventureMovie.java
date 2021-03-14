public class AdventureMovie extends Movie{
	int year;
	public AdventureMovie(int id, String name, int year) {
		super(id, name);
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return super.toString() + "AdventureMovie [year=" + year + "]";
	}
	
}