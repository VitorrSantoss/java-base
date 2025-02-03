package src;
import java.util.Scanner;

public class EX29 {
  public static void main(String[] args) {
    
    System.err.println("Informe o valor do produto a ser pago:");
    Scanner sc = new Scanner(System.in);
    double produto = sc.nextDouble();
    sc.close();
    double prestacao = produto/5;
    System.err.printf("Com R$ %.2f em 5 prestações, o valor a ser pago será R$ %.2f", produto, prestacao);

  }
}
