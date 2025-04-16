package database.connection;

public class MainMethod {

	public static void main(String[] args) {
		String carname = "Farrari";
		int model = 1947;
		String cherecter = "Ferrari's first road car, the 125 S, was produced in 1947";
		String engine = " V12-powered sports car";
		String topverent = "The Ferrari 296 GTB, priced at ₹5.40 crore (ex-showroom), is available in a single,";
		String baseverent = "The Ferrari Roma Rs. 3.76 crore, offering a 3855 cc engine";
		CarModelClass carobject = new CarModelClass(carname, model, cherecter, engine, topverent, baseverent);
		Icar object = new IcarImplements();
		int r = object.insert(carobject);
		System.out.println(r);

	}

}
 