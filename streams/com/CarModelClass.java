package streams.com;

import java.util.Objects;

public class CarModelClass {
	private String name;
	private String brand;
	private int price;

	public CarModelClass(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + brand + " " + price;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof CarModelClass))
//			return false;
//		CarModelClass car = (CarModelClass) obj;
//		return price == car.price && name.equalsIgnoreCase(car.brand);
//
//	}
//
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return Objects.hash(brand, name);
//	}

}
