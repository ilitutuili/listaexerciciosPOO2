import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double raio = scanner.nextDouble();
        double pi = 3.14;
        
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        
        System.out.printf(Locale.US, "%.2f%n", volume);
        
        scanner.close();
    }
}