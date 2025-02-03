package src;
import java.util.Scanner;

public class EX27 {
  public static void main(String[] args) {
    
    System.out.println("CONVERSOR DE MOEDA: R$ -> US$\nR$ 1,00 -> US$ 0,16\nUS$ 1,00 -> R$ 6,11");
    System.err.println("Informe o valor a ser convertido para Dóllar:");
    Scanner sc = new Scanner(System.in);
    double real = sc.nextDouble();
    sc.close();
    // COTAÇÃO!
    double cotacao = real/6.11;
    System.out.printf("Com R$ %.2f você terá US$ %.2f", real, cotacao);

  }
}
