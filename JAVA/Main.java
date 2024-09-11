import java.util.Scanner;
public class Main
{
	

    public static void main(String[] args) {
        int experiencia_missao, i,experiencia_total = 0;
        int nivel_atual,experiencia_prox_nivel ;
        int num_missoes;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas missões completadas: ");
        num_missoes = scanner.nextInt();

        if (num_missoes <= 0) {
            System.out.println("O número de missões deve ser um valor positivo!");
            return;
        }
        for (i = 0; i < num_missoes; i++) {

            System.out.print("Quantidade de experiência ganhada na missão: " + (i + 1) + ": ");
            experiencia_missao = scanner.nextInt();

            if (experiencia_missao < 0) {
                System.out.println("A experiência ganha deve ser um valor não negativo.");
                return;
            }
            experiencia_total += experiencia_missao;

            nivel_atual = experiencia_total / 1000;
            experiencia_prox_nivel = 1000 - (experiencia_total % 1000);

            System.out.println("Nível atual do personagem: " + (nivel_atual + 1));
            if (experiencia_prox_nivel == 1000) {
                System.out.println("Experiência restante para o próximo nível: 0 (Você está no nível máximo).");
            } else {
                System.out.println("Experiência restante para o próximo nível: " + experiencia_prox_nivel);
            }
        }
        scanner.close();
    }
}
