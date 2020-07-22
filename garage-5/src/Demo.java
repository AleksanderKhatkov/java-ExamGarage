import java.awt.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class Demo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Task_5_4");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);

		JTextArea textArea1 = new JTextArea();

		textArea1.setFont(new Font("Tahoma", Font.BOLD, 18));
		JScrollPane scrollPane1 = new JScrollPane(textArea1);
		textArea1.setEditable(false);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setFont(new Font("Tahoma", Font.BOLD, 18));
		JScrollPane scrollPane2 = new JScrollPane(textArea2);
		textArea2.setEditable(false);

		frame.setLayout(new GridLayout(1, 2, 2, 2));
//		frame.add(textArea1);
		frame.add(scrollPane1, BorderLayout.CENTER);

//		frame.add(textArea2);
		frame.add(scrollPane2, BorderLayout.CENTER);
		frame.setVisible(true);



		Garage garage = new Garage();
		try {
			garage.readFromCsvFile("111.txt");
		} catch (FileNotFoundException|MyException e) {
			System.out.println(e);
		}
		textArea1.setText(garage.toString());
		
		textArea2.setText(garage.findByFuel(Fuel.BENZIN).toString());
	}

}
