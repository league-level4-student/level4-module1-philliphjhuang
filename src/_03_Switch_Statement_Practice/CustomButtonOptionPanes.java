package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("School tomorrow :(");
			break;
		case "Monday":
			System.out.println("First day of the week :(");
			break;
		case "Tuesday":
			System.out.println("Second day of the week :(");
			break;
		case "Wednesday":
			System.out.println("Third day of the week :(");
			break;
		case "Thursday":
			System.out.println("Fourth day of the week :(");
			break;
		case "Friday":
			System.out.println("Tomorrow is free! :)");
			break;
		case "Saturday":
			System.out.println("Have fun :)");
			break;
		default:
			System.out.println("Something went wrong :(");
			break;
		}
	}
}
