package enumm.type;

public class Human {
	
	private String name;
	
	private Integer age;
	
	private Human_color_eye colorEye;
	
	private Human_color_hair colorHair;

	public Human(String name, Integer age, Human_color_eye colorEye, Human_color_hair colorHair) {
		this.name = name;
		this.age = age;
		this.colorEye = colorEye;
		this.colorHair = colorHair;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Human_color_eye getColorEye() {
		return colorEye;
	}

	public void setColorEye(Human_color_eye colorEye) {
		this.colorEye = colorEye;
	}

	public Human_color_hair getColorHair() {
		return colorHair;
	}

	public void setColorHair(Human_color_hair colorHair) {
		this.colorHair = colorHair;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", colorEye=" + colorEye + ", colorHair=" + colorHair + "]";
	}
	
	public void printDetail() {
		System.out.println("My name is " + name + ", i am " + age + " years old, my color eyes is " + colorEye + " and i have " + colorHair + " hair!!!");
	}
}
