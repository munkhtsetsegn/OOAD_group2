
public class HorrorMovie extends Movie{
int ageRange;

	public HorrorMovie(int id, String name, int ageRange) {
		super(id, name);
		this.ageRange = ageRange;
	}

	public int getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(int ageRange) {
		this.ageRange = ageRange;
	}

	@Override
	public String toString() {
		return super.toString() + "HorrorMovie [ageRange=" + ageRange + "]";
	}
	

}
