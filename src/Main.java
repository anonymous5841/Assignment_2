import java.sql.SQLOutput;

public class Main {
	public static void main(String[] args) {


		Tables t = new Tables(001,20,54,"wooden",60000,4,"wood",3,"rectangle");

		Seating s = new Seating(010,23,45,"sofa", 105500,3,"leather", 5,"530 kg");

		SmartPhones sm = new SmartPhones(100,50,20,"lenovo", 40000,5,5400,true, "windows",64,"5400px");

		Laptops l = new Laptops(0100,80,30,"asus", 150000,20,450,true,"intel core i7", "32 GB", 3);

		Audio_Device a = new Audio_Device(0001, 30,20,"mobile", 80000,20, 50, true);

		Groceries g = new Groceries(1010,50, 10,"bread", 200, 50, 10/12/2024, "calories, fats, carbs, carbohydrates");

		InventoryManagement i = new InventoryManagement(10);
		Reports r = new Reports(i.p);

		System.out.println("Individual products:");
		System.out.println(t);
		System.out.println(s);
		System.out.println(sm);
		System.out.println(l);
		System.out.println(a);
		System.out.println(g);


		System.out.println("\nProducts addition:");
		i.addProducts(001, "lenovo", 30 , 45, 60000, 30);
		i.addProducts(002, "Macbook", 50, 40, 90000, 90);
		i.addProducts(003, "asus", 70, 50,150000,40);
		i.addProducts(004,"MSI", 0, 40, 200000,60);

		System.out.println("\nProducts removal:");

		System.out.println(i.RemoveProducts("vivo"));
		System.out.println(i.RemoveProducts("asus"));

		System.out.println("\nProducts updation:");
		System.out.println(i.p[2]);
		System.out.println(i.updateProduct("lenovo","ipad",15,001,34,57000,9));
		System.out.println(i.p[0]);

		System.out.println("\nSearch by name and id:");

		System.out.println(i.GetProductByName("ipad"));
		System.out.println(i.GetProductByNameId(004));

		System.out.println("\nReportss:");

		System.out.println(r.SalesTrend());
		System.out.println(r.LowStock());
		System.out.println(r.Out_Of_Stock());
		System.out.println(r.PurchaseItemWeekly(23,43,5,6,76,2,5,110,3));
		System.out.println(r.PurchaseItemMonthly(5,34,5,2,8,43,8,2,2));



	}
}