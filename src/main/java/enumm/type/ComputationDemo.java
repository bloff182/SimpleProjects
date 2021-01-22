package enumm.type;

public class ComputationDemo {

	public static void main(String[] args) {

		System.out.println("Sum: " + Computation.ADD.perform(20, 4));
		System.out.println("Subtact: " + Computation.SUBTRACT.perform(20, 4));
		System.out.println("Multiply: " + Computation.MULTIPY.perform(20, 4));
		System.out.println("Divide: " + Computation.DIVIDE.perform(20, 4));
		
		
	}

}
