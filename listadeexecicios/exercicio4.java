import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double val1 = scanner.nextDouble();
        double val2 = scanner.nextDouble();
        char operacao = scanner.next().charAt(0);
        
        double resultado = 0;
        
        switch (operacao) {
            case '+':
                resultado = val1 + val2;
                break;
            case '-':
                resultado = val1 - val2;
                break;
            case '*':
                resultado = val1 * val2;
                break;
            case '/':
                resultado = val1 / val2;
                break;
        }
        
        if (resultado == (long) resultado) {
            System.out.println((long) resultado);
        } else {
            System.out.println(resultado);
        }
        
        scanner.close();
    }
}