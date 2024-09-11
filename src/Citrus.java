
public class Citrus extends Fruit{
	private String variety;
	public Citrus(String name, int calories, double price, int numSeeds, boolean isTropical, String variety) {
		super(name, calories, price, numSeeds, isTropical);
		this.variety = variety;
	}
	
	public String getVariety() {
		return this.variety;
	}
	public void testMethod() {
		System.out.println("I am in Citrus");
	}
}
