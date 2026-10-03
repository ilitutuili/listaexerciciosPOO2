import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double pes = scanner.nextDouble();
        
        double metros = (pes * 30.48) / 100.0;
        
        System.out.printf(Locale.US, "%.2f%n", metros);
        
        scanner.close();
    }
}