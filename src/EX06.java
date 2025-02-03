package src;
import java.util.Scanner;

public class EX06 {
  public static void main(String[] args) {
    System.out.println("Infome o raio do circulo:");
    Scanner sc = new Scanner(System.in);
    double raio = sc.nextDouble();
    sc.close();
    // CÁLCULO
    double areaCirculo = 3.14 * Math.pow(raio, 2);
    System.out.printf("A área do circulo é %.2f", areaCirculo);

  }
}
