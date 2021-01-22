package enumm.type;

public enum Computation {

	MULTIPY, DIVIDE, ADD, SUBTRACT;
	
	private double result;
	
	public double perform(double x, double y) {
		
		switch(this) {
		case ADD: result = x + y; 
			break;
		case DIVIDE: result = x / y;
			break;
		case MULTIPY:result = x * y;
			break;
		case SUBTRACT:result = x - y;
			break;
		default:
			break;
		
		}
		return result;
	};
}
