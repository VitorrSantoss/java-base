package src;
import java.util.Scanner;

public class EX24 {
  public static void main(String[] args) {
    
    System.out.println("Digite dois números:");
    Scanner sc = new Scanner(System.in);
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    sc.close();
    double soma = num1 + num2;
    double subtracao = num1 - num2;
    double multiplicacao = num1 * num2;
    double divisao = num1 / num2;
    System.out.printf("SOMA: %.1f\nSUBTRAÇÃO: %.1f\nMULTIPLICAÇÃO: %.1f\nDIVISÃO: %.1f", soma, subtracao, multiplicacao, divisao);

  }
}
