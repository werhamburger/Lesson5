import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Podaj dowolną liczbę całkowitą: ");
     int zmienna = scanner.nextInt();
        System.out.println(zmienna);



     Scanner strumień = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String imię = scanner.next();
        System.out.println("Podaj swoje nazwisko: ");
        String nazwisko = scanner.next();
        System.out.println("Podaj swój wiek: ");
        int wiek = scanner.nextInt();
        System.out.println("Użytkowniku, nazywasz się: " + imię + " " + nazwisko  + " oraz masz " + wiek + " lat.");

    }

    }

