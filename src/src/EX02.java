package src;
import java.util.Scanner;

public class EX02 {

  public static void main(String[] args) {
    System.out.println("Digite um número: ");
    Scanner sc = new Scanner(System.in);
    double numero = sc.nextDouble();
    sc.close();
    System.out.printf("O número informado foi %.2f", numero);
  }
}