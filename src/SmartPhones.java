public class SmartPhones extends Electronics{

	private String Operating_Software;

	private int Storage_capacity;

	private String Camera_Resolution;

	public SmartPhones(int id, int stock_quantity, int tax, String name, double price, int sold, int power, boolean warranty, String operating_Software, int storage_capacity, String camera_Resolution) {
		super(stock_quantity, tax, name, price, sold, power, warranty, id);
		Operating_Software = operating_Software;
		Storage_capacity = storage_capacity;
		Camera_Resolution = camera_Resolution;
	}

	public String getOperating_Software() {
		return Operating_Software;
	}

	public void setOperating_Software(String operating_Software){
		Operating_Software = operating_Software;
	}

	public int getStorage_capacity() {
		return Storage_capacity;
	}

	public void setStorage_capacity(int storage_capacity) {
		Storage_capacity = storage_capacity;
	}

	public String getCamera_Resolution() {
		return Camera_Resolution;
	}

	public void setCamera_Resolution(String camera_Resolution) {
		Camera_Resolution = camera_Resolution;
	}


	@Override
	public String toString() {
		return getName() +  " ," + getId() + " ," +getStock_quantity() + " ," + getTax() +" ," + getPrice() + " ," + getSold() + " ," + getPower() + " ," + getWarranty() + " ,"  + "Operating_Software='" + Operating_Software + ", Storage_capacity=" + Storage_capacity + ", Camera_Resolution='" + Camera_Resolution;
	}
}