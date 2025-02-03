package src;
import java.util.Scanner;

public class EX13 {
  public static void main(String[] args) {
    System.out.println("Informe a altura do retângulo:");
    Scanner sc = new Scanner(System.in);
    double altura = sc.nextDouble();
    System.out.println("Informe a largura do retângulo:");
    double largura = sc.nextDouble();
    sc.close();
    // CÁLCULO
    double area = largura * altura;
    System.err.printf("A área do retângulo é: %.2f", area);
  }
}
