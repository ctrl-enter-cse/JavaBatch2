package prasanna;

public class Division implements Calculator {
	   double result;
	@Override
	public void calculate(int Num1, int Num2) {
		 result=Num1/Num2;
		 System.out.println("the division of "+Num1+" and "+Num2+" = "+result);	
		
	}

}
