
public class Beverage extends Food{
	private int caffine;
	private char size;
	public Beverage(String name, int calories, double price, int caffine, char size) {
		super(name, calories, price);
		this.caffine = caffine;
		this.size = size;
	}
	
	public int getCaffine() {
		return this.caffine;
	}
	public char getSize() {
		return this.size;
	}
	
}
