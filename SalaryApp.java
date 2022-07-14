package prasanna.salary;

import java.util.Scanner;

public class SalaryApp {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Department d;
		
		System.out.println("For Hr department Press  1" );
		System.out.println("For Marketing Department Press 2");
		System.out.println("For Sales Department  Press 3");
		System.out.println("For Operation Department  Press 4 ");
		System.out.println("enter the choice");
		int choice= scanner.nextInt();
		
		switch (choice) {
		case 1:
			d = new HrDepartment();
			d.salary();
			break;
		case 2:
			d = new MarketingDepartment();
			d.salary();
			break;
		case 3:
			d = new Sales_Department();
			d.salary();
			break;
		case 4:
			d = new OperationDepartment();
			d.salary();
			break;
		
		default:
			System.out.println("invalid choice");
			
		}
		
		scanner.close();
	}

}
