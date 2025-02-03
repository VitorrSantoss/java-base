package src;
import java.util.Scanner;

public class EX05 {
  public static void main(String[] args) {
    System.out.println("Conversor de comprimento:\nMetros -> Centímetros:\nQuantos metros você deseja converter?");
    Scanner sc = new Scanner(System.in);
    double metros = sc.nextDouble();
    sc.close();
    // CONVERSOR 
    double cm = metros * 100;
    System.out.printf("%.2f Metros é %.2f Centimetros", metros, cm);

  }
}
