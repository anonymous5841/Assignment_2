public class Furniture extends Products{

	private String material;

	private int Dimensions;

	public Furniture(int stock_quantity, int tax, String name, double price, int sold, String material, int dimensions, int id) {
		super(stock_quantity, tax, name, price, sold, id);
		this.material = material;
		Dimensions = dimensions;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getDimensions() {
		return Dimensions;
	}

	public void setDimensions(int dimensions) {
		Dimensions = dimensions;
	}

		@Override
	public String toString() {
		return getName() +  " ," + getId() + " ," +getStock_quantity() + " ," + getTax() +" ," + getPrice() + " ," + getSold() + " ," + "material='" + material  + ", Dimensions=" + Dimensions;
	}
}