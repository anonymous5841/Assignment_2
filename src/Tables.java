public class Tables extends Furniture{

	private String shape;


	public Tables(int id,int stock_quantity, int tax, String name, double price, int sold, String material, int dimensions, String shape) {
		super(stock_quantity, tax, name, price, sold, material, dimensions, id);
		this.shape = shape;

	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return getName() +  " ," + getId() + " ," +getStock_quantity() + " ," + getTax() +" ," + getPrice() + " ," + getSold() + " ,"  + getMaterial()  + ", " + getDimensions() + " ,"+ "Shape = " + shape;
	}

}