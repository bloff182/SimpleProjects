package strefa.zadaniowa.kalkulator;

public enum Operations {

	ADD,
	SUBTRACT,
	MULTIPLY,
	DIVIDE,
	APPLY;
	
	
	private Integer y;
	private Integer result;
	
	public Integer obl(Integer x) {
		
		switch(this) {
		
		case ADD: result = y + x; break;
		case SUBTRACT: result = y - x; break;
		case MULTIPLY: result = y * x; break;
		case DIVIDE: result = y / x; break;
		default: result = 0;
		}
		
		return result;
	}
	

	
	
	
}
