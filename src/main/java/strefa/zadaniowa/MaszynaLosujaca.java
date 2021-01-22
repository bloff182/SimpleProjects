package strefa.zadaniowa;

/*
	Twoim zadaniem jest napisanie programu, kt�ry pobierze od u�ytkownika dwa argumenty:
	
	�cie�k� do pliku wej�ciowego w formacie CSV na dysku opisanym powy�ej,
	liczb� N >= 1 przedstawiaj�c� liczb� wygrywaj�cych.
	Program powinien wczyta� zawarto�� pliku, wy�uska� adresy e-mail, a nast�pnie w�r�d tych adres�w wylosowa� N wygranych. 
	Dla uproszczenia zak�adamy, �e format pliku jest poprawny oraz, �e uczestnicy konkursu nie oszukiwali 
	(nie by�o podw�jnych los�w). Sytuacja w kt�rej jeden uczestnik wygrywa dwie ksi��ki jest dopuszczalna.

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaszynaLosujaca {

	private final static Pattern FIELD_PATTERN = Pattern.compile("^\"(.+)\"$");

	private static String parseField(String field) {
		Matcher fieldMatcher = FIELD_PATTERN.matcher(field);
		if (fieldMatcher.matches()) {
			return fieldMatcher.group(1);
		}
		return null;
	}

	public static List<String> randomMachine(File file, int value) throws IOException {

		List<String> losowaczka = new LinkedList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(file));) {
			

			boolean firstLine = true;

			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				if (firstLine) {
					firstLine = false;
					continue;
				}
				String[] emails = line.split(",");

				losowaczka.add(MaszynaLosujaca.parseField(emails[2]));
				String emailExtra = MaszynaLosujaca.parseField(emails[4]);
				if (MaszynaLosujaca.parseField(emails[4]) != (null))
					losowaczka.add(emailExtra);

			}

		} catch (FileNotFoundException e) {
			System.out.println("File " + file.toString() + " doesn't exist");
			e.printStackTrace();
		} 
		
		Collections.shuffle(losowaczka);
		List<String> winners = new ArrayList<>();
		try {
			for (int i = 0; i < value; i++) {

				winners.add(losowaczka.get(i));

			}
		} catch (IndexOutOfBoundsException exc) {
			throw new IndexOutOfBoundsException("Nie ma tylu nagr�d - zmniejsz parametr value do max " + winners.size());
		}
		return winners;
	}

	public static void main(String[] args) throws IOException {

		System.out.println(MaszynaLosujaca
				.randomMachine(new File("C:\\Users\\tracz\\Downloads\\22_zadanie_maszyna_losujaca_input.csv"), 5));

	}

}
