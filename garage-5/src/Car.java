
public abstract class Car {
	private String name;
	private String color;
	private Fuel fuel;
	public Car(String name, String color, Fuel fuel) {
		super();
		this.name = name;
		this.color = color;
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", fuel=" + fuel
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fuel getFuel() {
		return fuel;
	}
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public abstract String toCsv();

}
