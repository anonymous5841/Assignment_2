public class Seating extends Furniture{

	private String Load_capacity;

	public Seating(int id, int stock_quantity, int tax, String name, double price, int sold, String material, int dimensions,  String load_capacity) {
		super(stock_quantity, tax, name, price, sold, material, dimensions, id);
		Load_capacity = load_capacity;
	}

	public String getLoad_capacity() {
		return Load_capacity;
	}

	public void setLoad_capacity(String load_capacity) {
		Load_capacity = load_capacity;
	}

	@Override
	public String toString() {
		return getName() +  " ," + getId() + " ," +getStock_quantity() + " ," + getTax() +" ," + getPrice() + " ," + getSold() + " ," + getMaterial()  + ", " + getDimensions() + "Load_capacity = " + Load_capacity ;
	}

}