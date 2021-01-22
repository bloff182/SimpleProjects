package enumm.type;

public class SeasonsDemo {

	public static void main(String[] args) {
		
		Seasons seasons = Seasons.SPRING;
		
		Integer day = null;
		
		switch (seasons) {
		case AUTHUM: System.out.println(":) " + seasons.name());
			break;
		case SPRING: System.out.println(":) " + seasons.name());
			break;
		case SUMMER: System.out.println(":) " + seasons.name());
			break;
		case WINTER: System.out.println(":) " + seasons.name());
			break;
		default:
			break;
		
		}

		System.out.println(seasons.getAvgTemp());
	}

}
