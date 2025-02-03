package src;
import java.util.Scanner;

public class EX10 {
  public static void main(String[] args) {
    System.out.println("Informe o raio da esfera:");
    Scanner sc = new Scanner(System.in);
    double raio = sc.nextDouble();
    sc.close();
    // CÁLCULO
    double volume = (4 * 3.14 * Math.pow(raio, 3))/3;
    System.out.printf("O volume da esfera é: %.2f",volume);
    
  }
}
