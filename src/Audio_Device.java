public class Audio_Device extends Electronics{
    public Audio_Device(int id, int stock_quantity, int tax, String name, double price, int sold, int power, boolean warranty) {
        super(stock_quantity, tax, name, price, sold, power, warranty, id);
    }

    @Override
    public String toString() {
        return getName() +  " ," + getId() + " ," +getStock_quantity() + " ," + getTax() +" ," + getPrice() + " ," + getSold() + " ," + getPower() + " ," + getWarranty();
    }
}