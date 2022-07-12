package prasanna;

public class Modulus implements Calculator {
	  double result;
			@Override
			public void calculate(int Num1, int Num2) {
				 result=Num1%Num2;
				 System.out.println("The Modulus of "+Num1+" and "+Num2+" = "+result);	
				
			}
}
