package prasanna.salary;

public class Within100Exception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {	
		return "The range should be within 100%";
	}

	

}
