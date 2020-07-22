
public class Bus extends Car {
	private int seatCount;
	private int doorCount;
	public Bus(String name, String color, Fuel fuel, int seatCount,
			int doorCount) {
		super(name, color, fuel);
		this.seatCount = seatCount;
		this.doorCount = doorCount;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public int getDoorCount() {
		return doorCount;
	}
	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}
	@Override
	public String toString() {
		return "\n" + super.toString() + " Bus [seatCount=" + seatCount + ", doorCount=" + doorCount + "]";
	}
	
	@Override
	public String toCsv() {
		return this.getClass().getName() + "," + getName() + "," + getColor() + "," + getFuel() + "," + getSeatCount() + "," + getDoorCount();
	} 
	
}
