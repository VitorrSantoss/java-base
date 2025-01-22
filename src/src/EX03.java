package src;
import java.util.Scanner;

public class EX03 {
  public static void main(String[] args) {
    System.out.println("Digite o 1º número: ");
    Scanner sc = new Scanner(System.in);
    int numero1 = sc.nextInt();
    System.out.println("Digite o 2º número: ");
    int numero2 = sc.nextInt();
    sc.close();
    int soma = numero1 + numero2;
    System.out.printf("A soma dos números digitados é: %d", soma);

  }
}
