package src;
import java.util.Scanner;

public class EX09 {
  public static void main(String[] args) {
    System.out.println("Informe a temperatura em Fahrenheit:");
    Scanner sc = new Scanner(System.in);
    double fahrenheit = sc.nextDouble();
    sc.close();
    // CONVERSÃO
    double celsius = 5 *((fahrenheit - 32)/9);
    System.out.printf("A temperatura em Celsius é %.2fº", celsius);
  }

}
