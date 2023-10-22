public class Electronics extends Products{

	private int power;

	private boolean warranty;

	public Electronics(int stock_quantity, int tax, String name, double price, int sold, int power, boolean warranty, int id) {
		super(stock_quantity, tax, name, price, sold, id);
		this.power = power;
		this.warranty = warranty;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public boolean getWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return getName() +  " ," + getId() + " ," +getStock_quantity() + " ," + getTax() +" ," + getPrice() + " ," + getSold() + " ," + "power = " + power + "," + "warranty=" + warranty;
	}
}