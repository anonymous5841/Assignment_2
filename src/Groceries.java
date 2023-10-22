public class Groceries extends Products{
	private int expiry_date;


	private String nutritional_value;

	public Groceries( int id, int stock_quantity, int tax, String name, double price, int sold, int expiry_date, String nutritional_value) {
		super(stock_quantity, tax, name, price, sold, id);
		this.expiry_date = expiry_date;
		this.nutritional_value = nutritional_value;
	}

	public int getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(int expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getNutritional_value() {
		return nutritional_value;
	}

	public void setNutritional_value(String nutritional_value) {
		this.nutritional_value = nutritional_value;
	}


	@Override
	public String toString() {
		return getName() +  " ," + getId() + " ," +getStock_quantity() + " ," + getTax() +" ," + getPrice() + " ," + getSold() + " ," + "expiry_date=" + expiry_date + ", nutritional_value='" + nutritional_value;
	}
}