package strefa.zadaniowa;

/*
	Zadanie do wykonaniaPermalink
	Napisz funkcj� findMissing, kt�ra jako argument przyjmuje tablic� N liczb ca�kowitych z zakresu od 0 do N. 
	W tablicy wszystkie elementy s� unikalne. Liczb z zakresu <0, N>, jest N + 1. Tablica ma d�ugo�� N. 
	W tablicy brakuje jednego elementu z zakresu. Funkcja findMissing powinna zwr�ci� brakuj�cy element: 
 
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		Integer tab[] = {22,9,3,23,7,0,1,20,12,17,18,11,21,10,6,13,25,8,19,16,4,15,5,14,2,24};
		List<Integer> list = Arrays.asList(tab);
		Collections.shuffle(list);
		for (Integer i: list) {
			System.out.print(i + ",");
		}
		System.out.println("\nBrakuje: " + findMissingNumber(tab));

	}

public static int findMissingNumber(Integer [] array) {
	
	int expected = (array.length +1) * array.length/2;
	
	int actual = 0;
	
	for(int i: array) {
		actual += i;
	}
	
	return expected - actual;
}
}