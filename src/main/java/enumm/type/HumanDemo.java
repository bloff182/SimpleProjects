package enumm.type;

public class HumanDemo {

	public static void main(String[] args) {
		
		
		Human human = new Human("Ala", 4, Human_color_eye.BLUE, Human_color_hair.BLOND );
		
		System.out.println(human);
		human.printDetail();

	}

}
