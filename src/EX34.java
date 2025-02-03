package src;
import java.util.Scanner;

public class EX34 {
  public static void main(String[] args) {
    
    System.err.println("Digite um número de 3 dígitos:");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    sc.close();

    int u = numero / 1 % 10;
    int d = numero / 10 % 10;
    int c = numero / 100 % 10;

    System.out.printf("Unidade: %d\nDezena: %d\nCentena: %d", u,d, c);
    
  }
}
