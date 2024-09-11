
public class Fruit extends Food{
	private int numSeeds;
	private boolean isTropical;
	
	public Fruit(String name, int calories, double price, int numSeeds, boolean isTropical) {
		super(name,calories,price);
		this.numSeeds = numSeeds;
		this.isTropical = isTropical;
	}
	public int numSeeds() {
		return this.numSeeds;
	}
	public boolean getisTropical() {
		return this.isTropical;
	}
	public void testMethod() {
		System.out.println("I am in Fruit");
	}
}
