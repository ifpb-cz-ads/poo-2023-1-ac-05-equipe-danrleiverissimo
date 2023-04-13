import java.util.Scanner;
public class Q06_BM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int dia;
        do {
            System.out.print("Digite um número de 1 a 7 (ou 0 para sair): ");
            dia = scanner.nextInt();
            switch(dia) {
                case 1:
                    System.out.println("Domingo");break;
                case 2:
                    System.out.println("Segunda-feira");break;
                case 3:
                    System.out.println("Terça-feira");break;
                case 4:
                    System.out.println("Quarta-feira");break;
                case 5:
                    System.out.println("Quinta-feira");break;
                case 6:
                    System.out.println("Sexta-feira");break;
                case 7:
                    System.out.println("Sábado");break;
                case 0:
                    System.out.println("Saindo do programa...");break;
                default:
                    System.out.println("Número inválido. Digite um número de 1 a 7.");
            }
        } while (dia != 0);
    }
}
