import java.util.Random;
import java.util.Scanner;

public class missao_condicao {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o valor de Força: ");
        int forca = scanner.nextInt();

        System.out.print("Digite o valor de Destreza: ");
        int destreza = scanner.nextInt();

        System.out.print("Digite o valor de Sorte: ");
        int sorte = scanner.nextInt();

        int num_aleatorio = random.nextInt(101); 

        boolean sucesso = (forca + destreza > 50) && (sorte > num_aleatorio);

        System.out.println("Número aleatório gerado: " + num_aleatorio);
        if (sucesso) {
            System.out.println("Missão bem-sucedida!");
        } else {
            System.out.println("Missão fracassada.");
        }

        scanner.close();
    }
}
