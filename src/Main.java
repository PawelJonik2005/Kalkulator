import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję: ");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        int a = scanner.nextInt();
        if (a >= 1 && a <= 4) {
            System.out.println("Podaj 1 liczbę: ");
            double liczba1 = scanner.nextInt();
            System.out.println("Podaj 2 liczbę: ");
            double liczba2 = scanner.nextInt();
            if (a == 1) {
                double suma = liczba1 + liczba2;
                System.out.println("Wynik dodawania: " + suma);
            } else if (a == 2) {
                double roznica = liczba1 - liczba2;
                System.out.println("Wynik odejmowania: " + roznica);
            } else if (a == 3) {
                double iloczyn = liczba1 * liczba2;
                System.out.println("Wynik mnożenia: " + iloczyn);
            } else if (a == 4) {
                double iloraz = liczba1 / liczba2;
                System.out.println("Wynik dzielenia: " + iloraz);
            } else
                System.out.println("Wybrano złą opcję");
        }
        else
            System.out.println("Wybrano złą opcję");
    }
    }