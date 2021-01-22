package strefa.zadaniowa;

/*
	Zadanie polega na wydrukowaniu choinki na ekranie :) 
	Twoim zadaniem jest przyj�cie argumentu od u�ytkownika kt�rym b�dzie wysoko�� choinki. 
	Program powinien wypisa� na konsoli choink� tej wysoko�ci.
*/

public class Choinka {

	public static void main(String[] args) {
		
		int x = 50;
		
		char star = '*';
		StringBuilder christmasTree = new StringBuilder();
		for (int i=1; i<=x; i++) {
			
			for(int a=1; a<=x-i; a++) {
				christmasTree.append(" ");
			}
			for (int j=x-i+1; j<=x+i-1; j++) {
				christmasTree.append(star);
				
			}
			christmasTree.append(System.lineSeparator());
		}
		System.out.println(christmasTree.toString());

	}

}
