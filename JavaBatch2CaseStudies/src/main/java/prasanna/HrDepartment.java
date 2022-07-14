package prasanna.salary;

import java.util.Scanner;

public class HrDepartment implements Department {

	@Override
	public void salary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Basic salary for the HrDepartment:");
		double basicSalary = scanner.nextDouble();
		System.out.println("Please enter the Bonus for an employee");
		double bonus = scanner.nextInt();
		
		double  salary = basicSalary + bonus;   //adding the bonus to Hr_Dept
		System.out.println("Total Salary ="+salary);	
		scanner.close();
	}

}
