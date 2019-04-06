package p2;

import lombok.AllArgsConstructor;
import service.api.IProgram;
import service.api.IStopable;

import java.time.LocalDate;

@AllArgsConstructor
public class Menu implements IProgram, IStopable {
	private Calculator calculator;

	public void execute() {
		String choice;
		do {
			System.out.println(" Menue-Auswahl");
			System.out.println(" [1] Celsius          -> Fahrenheit");
			System.out.println(" [2] Fahrenheit       -> Celsius   ");
			System.out.println(" [3] Integer          -> Binär     ");
			System.out.println(" [4] Binär            -> Integer   ");
			System.out.println(" [5] Diff Date d1 d2  -> Anzahl Tage");
			System.out.println(" [0] beenden  ");

			choice = getScanner().next("Bitte geben sie eine Valide aktion an.", "0", "1", "2", "3", "4", "5");
			switch (choice) {
			case "1":
				System.out.println("Temperatur in Celsius eingeben");
				Double celsius = getScanner().nextDouble("Bitte gebe eine valide Zahl ein.");
				if (celsius == null) {
					break;
				}

				System.out.println(celsius + " Grad Celsius sind: "+ calculator.celsiusToFahrenheit(celsius) + " Grad Fahrenheit");
			    break;			
			case "2":
				System.out.println("Temperatur in Fahrenheit eingeben");
				Double fahrenheit = getScanner().nextDouble("Bitte gebe eine valide Zahl ein.");

				if (fahrenheit == null) {
					break;
				}

				System.out.println(fahrenheit + " Grad Fahrenheit sind:" + calculator.fahrenheitToCelsius(fahrenheit) +" Grad Celsius");
			    break;				
			case "3":
				System.out.println("Bitte geben sie die Zahl ein, die sie zu einem Binary machen wollen.");
				Integer number = getScanner().nextInteger("Keine Gültige Zahl, bitte versuche es erneut.");

				if (number == null) {
					break;
				}

				System.out.println(number + " ist in binär: " + calculator.toBinary(number));
			   break;			 
			case "4":
				System.out.println("Gebe einen Binären String ein:");
				String next = getScanner().next("Bitte gebe ein Valider Binary String an.", calculator::validateBinaryString);

				if (next == null) {
					break;
				}

				System.out.println("Die zahl ist: " + calculator.binaryToInteger(next));
			   break;
			case "5":
				System.out.println("bitte geben sie das erste Datum in ein (yyyy/MM/dd):");
				String pattern = "yyyy/MM/dd";
				LocalDate date1 = getScanner().getDate(pattern, "Bitte geben sie ein valides Datum an. (yyyy/MM/dd)");
				System.out.println("bitte geben sie das zweite Datum ein: (yyyy/MM/dd)");
				LocalDate date2 = getScanner().getDate(pattern, "Bitte geben sie ein valides Datum an. (yyyy/MM/dd)");

				System.out.println("Anzahl Tage zwischen " + date1.toString() + " und " + date2.toString() + " ist: " + calculator.diffDate(date1, date2));
			break;
			default:
				choice = "0";
			}
	
		} while(!choice.equalsIgnoreCase("0"));

		System.out.println("Program wird beendet");
	}
}
