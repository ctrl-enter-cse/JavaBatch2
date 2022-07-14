package prasanna.salary;

import java.util.Scanner;

public class MarketingDepartment implements Department {

	@Override
	public void salary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Basic salary for the MarketingDepartment:");
		double basicSalary = scanner.nextDouble();
		System.out.println("Please enter the travelAllowance to employee");
		double travelAllowance = scanner.nextDouble();
		
		double  salary = basicSalary + travelAllowance;  //adding the travelAllowance to market_Dept
		System.out.println( "Total Salary ="+salary);	
		scanner.close();
	}

}
