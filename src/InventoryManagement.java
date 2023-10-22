public class InventoryManagement{

     private int numberOfProducts;

      Products p[];

    public InventoryManagement(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
        this.p = new Products[numberOfProducts];

    }

    public Products[] getP(int index) {
        return p;
    }

    public void setP(Products[] p) {
        this.p = p;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public String addProducts( int id, String name, int stock_quantity, int tax, double price, int sold){

        String n = name.toLowerCase();
        for (int i = 0; i < numberOfProducts; i++) {

            if(p[i] == null){
            p[i] = new Products(stock_quantity, tax, n, price, sold, id);
                return String.format("Product successfully added!");
            }

        }
            return String.format("Inventory is full");


    }

    public String RemoveProducts(String name){

        String local;
       local = name.toLowerCase();
        for (int i = 0; i < numberOfProducts; i++) {

            if(p[i] != null){
            if(local.equals(p[i].getName())){

                p[i] = null;

                for (int j = i; p[i] == null; j++, i++) {
                    p[j] = p[j + 1];
                }
                p[i] = null;

                return String.format("Successfully removed");
            }
        }}

        return String.format("such product doesn't exist");
    }


    public String updateProduct(String Oldname, String updated_name, int updated_stock_quantity,  int updated_id, int updated_tax, double updated_price, int updated_sold){

        String local;
        local = Oldname.toLowerCase();
        for (int i = 0; i < numberOfProducts; i++) {

            if (p[i] != null)
            {
            if(local.equals(p[i].getName())){

                p[i] = new Products(updated_stock_quantity, updated_tax, updated_name, updated_price, updated_sold, updated_id);
                return String.format("Successfully updated");
            }
        }
        }
        return String.format("such product doesn't exist");
    }

    public String GetProductByName(String name) {

        String local;
        local = name.toLowerCase();

        for (int i = 0; i < numberOfProducts; i++) {

            if ( p[i] != null){
            if (local.equals(p[i].getName())) {

                return "According to your search: " + p[i].toString();
            }
        }}

        return "Such product doesn't isn't available in the inventory";
    }

    public String GetProductByNameId(int ID) {


        for (int i = 0; i < numberOfProducts; i++) {
            if ( p[i] != null){
            if (ID == p[i].getId()) {
                return "According to your search: " + p[i].toString();
            }
        }}
        return "Such product doesn't isn't available in the inventory";
    }

}
