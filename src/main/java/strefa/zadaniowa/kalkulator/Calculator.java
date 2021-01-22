package strefa.zadaniowa.kalkulator;

/*
	Napisz program, kt�ry zwr�ci wynik otrzymany na podstawie zestawu instrukcji. 
	Instrukcje sk�adaj� si� ze s�owa kluczowego i liczby oddzielonych spacj�. 
	Instrukcje oddzielone s� znakiem nowej linii. Zestaw instrukcji pobierany jest z pliku, 
	a wynik oblicze� powinien by� wypisany na ekranie. Plik mo�e zawiera� dowoln� liczb� instrukcji. 
	Instrukcje mog� by� dowoln� operacj� przyjmuj�c� dwa argumenty (np. add, subtract, multiply, divide itp.). 
	Instrukcje powinny by� interpretowane w kolejno�ci wprowadzenia (kolejno�� operacji w matematyce powinna by� ignorowana).
	Ostatni� instrukcj� powinna by� apply i liczba. Na przyk�ad apply 3. 
	Ta liczba powinna by� u�yta w trakcie tworzenia instancji kalkulatora. 
	Nast�pnie kalkulator powinien wykona� po kolei wszystkie wcze�niej podane operacje.

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Calculator {

	public static void main(String[] args) throws IOException {

		System.out.println(Calculator.apply("calc.txt"));
	}

	public static int calc(List<String> operations, List<Integer> numbers, int operationsNumber) {
		int result = numbers.get(numbers.size() - 1);
		for (int i = 0; i < operationsNumber-1; i++) {

				if (operations.get(i).equals("add")) {
					result += numbers.get(i);
				}
				if (operations.get(i).equals("multiply")) {
					result *= numbers.get(i);
				}
				if (operations.get(i).equals("divide")) {
					if (numbers.get(i) == 0)
						throw new ArithmeticException("Divide by zero");
					result /= numbers.get(i);
				}
				if (operations.get(i).equals("subtract")) {
					result -= numbers.get(i);
				}
			}
		
		return result;
	}
	
	public static int apply(String filePath) throws IOException {
		final File file = new File(filePath);

		List<String> operations = new LinkedList<>();
		List<Integer> numbers = new LinkedList<>();

		int operationsNumber = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(file));){

			while (true) {
				String line = reader.readLine();
				if (line == null)
					break;
				String[] calc = line.split(" ");
				operations.add(calc[0].trim());
				numbers.add(Integer.parseInt(calc[1].trim()));

				operationsNumber++;
			}

		} catch (IOException e) {
			System.out.println("File " + file + " doesn't exist");
			throw new FileNotFoundException("File doesn't exist");
		}
		
		return Calculator.calc(operations, numbers, operationsNumber);
	}
	
}
