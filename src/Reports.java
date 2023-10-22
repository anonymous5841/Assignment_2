public class Reports {

	private Products p1[];

	public Reports(Products[] p1) {
		this.p1 = p1;
	}

	public Products[] getP1() {
		return p1;
	}

	public void setP1(Products[] p1) {
		this.p1 = p1;
	}

	public String SalesTrend(){

		int max = p1[0].getSold();
		int index = 0;

		for (int i = 0; i < p1.length; i++) {

			if (p1[i] != null){
			if(max < p1[i].getSold()){
				max = p1[i].getSold();
				index = i;
			}}
		}
		return "Most Trendy product :" + p1[index].toString();
	}

	public String LowStock(){

		int low = p1[0].getStock_quantity();
		int index = 0;

		for (int i = 0; i < p1.length; i++) {

			if (p1[i] != null){
				if(low > p1[i].getStock_quantity()){
					low = p1[i].getStock_quantity();
					index = i;
				}}
		}
		return "lowest stock is of :" + p1[index].toString();

	}

	public String Out_Of_Stock(){

		StringBuilder s = new StringBuilder();
         int j = 0;

		for (int i = 0; i < p1.length; i++) {

			if (p1[i] != null){
				if(p1[i].getStock_quantity() == 0){
					s.append(p1[i] + "\n");
					j++;
				}}
		}
		if(j != 0){
			return "Out of Stock products are: " + "\n"  + s.toString();
		}
		return "None of the products is out of stock";

		}

		public String PurchaseItemWeekly(int Electronics, int Furniture, int Groceries, int Seating, int Tables, int audio_device, int smartphone, int laptops, int Weeks){



		return "Weekly purchased:" + "\n" +
				"Electronics: " + (Electronics * (Weeks * 7)) + "\n" +
					"Audio device: " + (audio_device * (Weeks * 7)) + "\n" +
					"Laptops: " + (laptops * (Weeks * 7)) + "\n" +
					"Samrtphones: " + (smartphone * (Weeks * 7)) + "\n" +
					"Furniture: " + (Furniture * (Weeks * 7)) + "\n" +
					"Seating: " + (Seating * (Weeks * 7)) + "\n" +
					"Tables: " + (Tables * (Weeks * 7)) + "\n" +
					"Groceries: " + (Groceries * (Weeks * 7)) + "\n";


		}


	public String PurchaseItemMonthly(int Electronics, int Furniture, int Groceries, int Seating, int Tables, int audio_device, int smartphone, int laptops, int Months){

		int month = 0;
		if (Months % 2 == 0){
			month = Months / 2;
			month = 31 * month + 30 * month;
		}
		else if (Months % 2 != 0) {
			switch(Months){
				case 1: {
				month = 30;
				}
				case 3: {
					month = 30+ 31+ 30;
				}
				case 5: {
					month = 30 * 3 + 31 * 2;
				}
				case 7: {
					month = 30 * 4 + 31 * 3;
				}
				case 9: {
					month = 30 * 5 + 31 * 4;
				}
				case 11: {
					month = 30 * 6 + 31 * 5;
				}
			}
		}


		return "Monthly purchased:" + "\n" +
				"Electronics: " + Electronics * month + "\n" +
				"Audio device: " + audio_device * month + "\n" +
				"Laptops: " + laptops * month + "\n" +
				"Samrtphones: " + smartphone * month + "\n" +
				"Furniture: " + Furniture * month + "\n" +
				"Seating: " + Seating * month + "\n" +
				"Tables: " + Tables * month + "\n" +
				"Groceries: " + Groceries * month + "\n";

	}
}