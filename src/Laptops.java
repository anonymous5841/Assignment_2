public class Laptops extends Electronics {

	private String processor_type;

	private String RAM_size;

	private int Screen_Dimensions;

	public Laptops(int id, int stock_quantity, int tax, String name, double price, int sold, int power, boolean warranty, String processor_type, String RAM_size, int screen_Dimensions) {
		super(stock_quantity, tax, name, price, sold, power, warranty, id);
		this.processor_type = processor_type;
		this.RAM_size = RAM_size;
		Screen_Dimensions = screen_Dimensions;
	}

	public String getProcessor_type() {
		return processor_type;
	}

	public void setProcessor_type(String processor_type) {
		this.processor_type = processor_type;
	}

	public String getRAM_size() {
		return RAM_size;
	}

	public void setRAM_size(String RAM_size) {
		this.RAM_size = RAM_size;
	}

	public int getScreen_Dimensions() {
		return Screen_Dimensions;
	}

	public void setScreen_Dimensions(int screen_Dimensions) {
		Screen_Dimensions = screen_Dimensions;
	}

	@Override
	public String toString() {
		return getName() +  " ," + getId() + " ," +getStock_quantity() + " ," + getTax() +" ," + getPrice() + " ," + getSold() + " ," + getPower() + " ," + getWarranty()  + "processor_type='" + processor_type + ", RAM_size='" + RAM_size + ", Screen_Dimensions=" + Screen_Dimensions;
	}
}