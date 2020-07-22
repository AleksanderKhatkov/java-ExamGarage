// ���������� �����-��������� �������� ���������� � �������������� ����������� � ��������� �������
public class LegCar extends Car {
	private String seats;

	public LegCar(String name, String color, Fuel fuel, String seats) {
		super(name, color, fuel);
		this.seats = seats;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + " LegCar [seats=" + seats + "]";
	}

	@Override
	public String toCsv() {
		return this.getClass().getName() + "," + getName() + "," + getColor() + "," + getFuel() + "," + getSeats();
	}
}
