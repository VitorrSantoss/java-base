package src;
import java.util.Scanner;

public class EX11 {

  public static void main(String[] args) {
    System.out.println("Informe a base do triângulo:");
    Scanner sc = new Scanner(System.in);
    double base = sc.nextDouble();
    System.out.println("Infome a altura do triângulo:");
    double altura = sc.nextDouble();
    sc.close();
    // CÁLCULO:
    double conta = (base * altura)/2;
    System.err.printf("A área do triângulo de base %.2f e altura de %.2f é %.2f", base, altura, conta);
  }
}