
public class Vegetable extends Food {
	private String growthSeason;
	private boolean isLeafy;
	
	public Vegetable(String name, int calories, double price, String growthSeason, Boolean isLeafy){
		super(name,calories,price);
		this.growthSeason = growthSeason;
		this.isLeafy = isLeafy;
	}
	public String getgrowthSeason() {
		return this.growthSeason;
	}
	public boolean getisLeafy() {
		return this.isLeafy;
	}
}
