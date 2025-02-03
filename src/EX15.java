package src;
import java.util.Scanner;

public class EX15 {
  public static void main(String[] args) {
    System.out.println("Sobre o Cone...\nInforme o raio da base:");
    Scanner sc = new Scanner(System.in);
    double raioBase = sc.nextDouble();
    System.out.println("Informe a altura:");
    double altura = sc.nextDouble();
    sc.close();
    //  CONTA
    double volume = (3.14 * Math.pow(raioBase, 2) * altura)/3;
    System.out.printf("O volume do cone é: %.2f", volume);
  }
}
