package prasanna;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to calculator");
		System.out.println("enter the 1 st number");
		int n1 = scanner.nextInt();
		System.out.println("enter the 2 st number");
		int n2 = scanner.nextInt();
		boolean flag = true;
		while (flag) {

			System.out.println("Select the the operation:");
			System.out.println("For addition 1");
			System.out.println("For subtraction 2 ");
			System.out.println("For divison 3 ");
			System.out.println("For modulus  4 ");
			System.out.println("For percentage  5 ");
			System.out.println("For Multiplication 6 ");

			int choice = scanner.nextInt();
			Calculator c;

			switch (choice) {
			case 1:
				c = new Addition();
				c.calculate(n1, n2);
				break;
			case 2:
				c = new Substraction();
				c.calculate(n1, n2);
				break;
			case 3:
				c = new Division();
				c.calculate(n1, n2);
				break;
			case 4:
				c = new Modulus();
				c.calculate(n1, n2);
				break;
			case 5:
				c = new Percentage();
				c.calculate(n1, n2);
				break;
			case 6:
				c = new Multiplication();
				c.calculate(n1, n2);
				break;
			default:
				System.out.println("invalid choice");
				flag = true;
			}
			flag=false;
		}
		scanner.close();

	}

}
