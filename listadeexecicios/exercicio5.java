import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maiorValor = Integer.MIN_VALUE;
        int posicaoMaior = 0;
        
        for (int i = 1; i <= 10; i++) {
            int num = scanner.nextInt();
            if (i == 1 || num > maiorValor) {
                maiorValor = num;
                posicaoMaior = i;
            }
        }
        
        System.out.println(posicaoMaior);
        
        scanner.close();
    }
}