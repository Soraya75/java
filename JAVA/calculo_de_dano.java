import java.util.Scanner;

public class calculo_de_dano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double dano_total = 0;
        int i;
        double dano_ataque, dano_base, mult_critico;
        
        System.out.print("Digite o número de ataques realizados: ");
        int num_ataques = scanner.nextInt();
        
        if (num_ataques <= 0) {
            System.out.println("Número de ataques deve ser maior que zero.");
            return;
        }
        
        for (i = 1; i <= num_ataques; i++) {
            System.out.print("Digite o dano base do ataque " + i + ": ");
            dano_base = scanner.nextDouble();
            
            System.out.print("Digite o multiplicador de crítico do ataque " + i + " (entre 0.0 e 2.0): ");
            mult_critico = scanner.nextDouble();
            
            if (mult_critico < 0.0 || mult_critico > 2.0) {
                System.out.println("Multiplicador de crítico deve estar entre 0.0 e 2.0.");
                return;
            }
            
            dano_ataque = dano_base * mult_critico;
            
            dano_total += dano_ataque;
        }
        
        System.out.printf("O dano total causado pelo personagem é: %.2f%n", dano_total);
        
        scanner.close();
    }
}
