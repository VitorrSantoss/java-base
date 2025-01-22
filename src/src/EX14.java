package src;
import java.util.Scanner;

public class EX14 {
  public static void main(String[] args) {

    System.out.println("Informe o comprimento da aresta do cubo:");
    Scanner sc = new Scanner(System.in);
    double aresta = sc.nextDouble();
    sc.close();
    // CÁLCULO
    double volume = Math.pow(aresta, 3);
    System.out.printf("O volume do cubo é: %.2f", volume);
  }
}
