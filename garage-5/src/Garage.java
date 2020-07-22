import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Garage {
	private List<Car> list = new ArrayList<>();
	
	// 5)	���������� ����������
	public void add(Car car) {
		list.add(car);
	}

	@Override
	public String toString() {
		return "Garage [list=" + list + "]";
	}
	
	// 6)	�������� ���������� �� ��������
	public void remove(String name) {
		list.removeIf((Car car)->(car.getName().equals(name)));
	}
	
	// 7)	����� ���� ����������� �� ����� � ���������� ������� ��������
	public void print() {
		list.sort((Car car1, Car car2)->(car1.getName().compareTo(car2.getName())));
		System.out.println(this);
	}
	
	// 8)	����� ����������� �� ��������� ���� �������;
	public List<Car> findByFuel(Fuel fuel) {
		List<Car> result = new ArrayList<>(list);
		result.removeIf((Car car)->(car.getFuel()!=fuel));
		return result;
	}
	
	// 9)	������� ����������� ��������� �����;
	public int countByColor(String color) {
		int count = 0;
		for (Car car : list) {
			if (car.getColor().equals(color)) {
				++count;
			}
		}
		return count;
	}
	
	// 10)	���������� � ��������� ���� � �������� ������;
	public void writeToCsvFile(String outputFileName)
			throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(outputFileName);
		for (Car car : list) {
			pw.println(car.toCsv());
		}
		pw.close();
	}
	// 11)	�������� �� ���������� �����;
	public void readFromCsvFile(String inputFileName) throws FileNotFoundException, MyException {
		Scanner sc = new Scanner(new File(inputFileName));
		String line;
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			String[] fields = line.split(",");
			
			switch (fields[0]) {
			case "LegCar":
				list.add(new LegCar(fields[1], fields[2],
						Fuel.valueOf(fields[3]), fields[4]));
				break;
			case "Bus":
				list.add(new Bus(fields[1], fields[2],
						Fuel.valueOf(fields[3]), Integer.valueOf(fields[4]), Integer.valueOf(fields[5])));
				break;
			default:
				throw new MyException("Error in Class Name");
			}
		}
		sc.close();
	}
}
