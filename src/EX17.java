package src;
import java.util.Scanner;

public class EX17 {
  public static void main(String[] args) {
    System.out.println("Vamos verificar o peso ideal para sua altura!\nInforme sua altura: ");
    Scanner sc = new Scanner(System.in);
    double altura = sc.nextDouble();
    sc.close();
    // CONTA 
    double pesoIdeal = (72.7 * altura)-58;
    System.out.printf("O peso ideal para sua altura é: %.2f", pesoIdeal);



  }
}
