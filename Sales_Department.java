package prasanna.salary;

import java.util.Scanner;

public class Sales_Department implements Department {

	@Override
	public void salary()  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Basic salary for the Sales_Department:");
		double basicSalary = scanner.nextDouble();
		System.out.println("Please enter the incentives for an employee");
		double incentives = scanner.nextDouble();
		try{
		check(incentives);								// checking the incentives 
		double  salary = basicSalary + ((basicSalary *incentives)/100);    //adding the incentives to Sales_Department
		System.out.println( "Total Salary ="+salary);	
		
		}catch( Exception e){
			System.out.println("invalid input......");
				
	}
		scanner.close();
	
	}

	public void check(double incentives) throws Within100Exception {
		if (incentives > 100) {    // checking the incentives  and throwing the exception message

			Within100Exception ex= new Within100Exception();
			System.out.println(ex.getMessage());
			throw ex;   // throwing the exception to the caller to line 15 then to exception catch block 
		}
		
	}

}
