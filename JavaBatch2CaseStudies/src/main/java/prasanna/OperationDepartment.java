package prasanna.salary;

import java.util.Scanner;

public class OperationDepartment implements Department {

	@Override
	public void salary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Basic salary for the OperationDepartment:");
		double basicSalary = scanner.nextDouble();
		System.out.println("Please enter the hra for an employee");
		double hra = scanner.nextDouble();
		
		double  salary = basicSalary + hra;    //adding the hra to operation_Dept
		System.out.println( "Total Salary ="+salary);	
		scanner.close();
	}

}
