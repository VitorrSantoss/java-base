package src;
import java.util.Scanner;

public class EX04 {
  public static void main(String[] args) {
    System.out.println("1º NOTA:");
    Scanner sc = new Scanner(System.in);
    double nota1 = sc.nextDouble();
    System.out.println("2º NOTA:");
    double nota2 = sc.nextDouble();
    System.out.println("3º NOTA:");
    double nota3 = sc.nextDouble();
    System.out.println("4º NOTA:");
    double nota4 = sc.nextDouble();
    sc.close();
    double media = (nota1 + nota2 + nota3 + nota4)/4;
    System.out.printf("A média é: %.2f",media);
  }
}
