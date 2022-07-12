package prasanna;

public class Percentage implements Calculator {
	double result;

	@Override
	public void calculate(int Num1, int Num2) {
		result = Num1*100 / Num2;
	
		System.out.println("The percentage of " + Num1 + " and " + Num2 + " = " + result);

	}

}
