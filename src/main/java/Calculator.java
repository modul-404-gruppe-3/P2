import java.time.LocalDate;
import java.util.Scanner;

public class Calculator {
    public double celsiusToFahrenheit(double celsius) {
        //TODO implement
        return -1;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        //TODO implement
        return -1;
    }

    public String diffDate(LocalDate d1, LocalDate d2) {
        return null;
    }

    public void start() {
        int choice  = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menue Auswahl");
            System.out.println("[1] Celsius             -> Fahrenheit");
            System.out.println("[2] Fahrenheit             -> Celsius");
            System.out.println("[3] Interger             -> Binär");
            System.out.println("[4] Binär             -> Interger");
            System.out.println("[5] Diff Date d1 d2     -> Anzahl Tage");
            System.out.println("[0] Beenden");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    //TODO exception handling
                    System.out.println("temeratur in Celsius eingeben");
                    double celsius = Double.parseDouble(scanner.nextLine());
                    System.out.println(celsius + " Grad Celsius sind: " + this.celsiusToFahrenheit(celsius) + " Grad Fahrenheit");
                    break;
                case 2:
                    //TODO exception handling
                    System.out.println("temeratur in Celsius eingeben");
                    double fahrenheit = Double.parseDouble(scanner.nextLine());
                    System.out.println(fahrenheit + " Grad Fahrenheit sind: " + this.fahrenheitToCelsius(fahrenheit) + " Grad Celsius");
                    break;
                case 3:
                    //TODO implement
                    //TODO exception handling
                    break;
                case 4:
                    //TODO implement
                    //TODO exception handling
                    break;
                case 5:
                    //TODO implement
                    //TODO exception handling
                    LocalDate d1 = null;
                    LocalDate d2 = null;
                    System.out.println("Anzahl tage zwischen D1 und D2 ist " + this.diffDate(d1, d2));
                    break;
                default:
                    //TODO implement
                    //TODO exception handling
                    break;
            }
        }while (choice != 0);

        System.out.println("Programm beendet!");
    }

}
