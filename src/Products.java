public class Products {

  private int id;
	private int stock_quantity;

	private int tax;

	private String Name;

	private double price;

	private int sold;

	public Products(int stock_quantity, int tax, String name, double price, int sold, int id) {
		this.stock_quantity = stock_quantity;
		this.tax = tax;
		Name = name;
		this.price = price;
		this.sold = sold;
		this.id = id;
	}

	public int getStock_quantity() {
		return stock_quantity;
	}

	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrize(double price) {
		this.price = price;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "stock_quantity = " + stock_quantity + ", tax = " + tax + ", Name = " + Name  + ", price = " + price + ", sold = " + sold;
	}
}