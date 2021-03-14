
public class ComedyMovie extends Movie{
	int comedyLevel;
	public ComedyMovie(int mId, String name, int comedyLevel) {
		super(mId, name);
		this.comedyLevel = comedyLevel;
	}
	public int getComedyLevel() {
		return comedyLevel;
	}
	public void setComedyLevel(int comedyLevel) {
		this.comedyLevel = comedyLevel;
	}
	@Override
	public String toString() {
		return super.toString() + "ComedyMovie [comedyLevel=" + comedyLevel + "]";
	}
	
}
