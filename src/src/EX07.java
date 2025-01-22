package src;
import java.util.Scanner;

public class EX07 {
  public static void main(String[] args) {
    System.out.println("Informe o lado do quadrado:");
    Scanner sc = new Scanner(System.in);
    double lado = sc.nextDouble();
    sc.close();
    double areaQuadrado = Math.pow(lado, 2);
    double dobroAreaQuadrado = areaQuadrado * 2;
    System.out.printf("Área do Quadrado: %.2f\nDobro da Área do Quadrado: %.2f",areaQuadrado, dobroAreaQuadrado);
  }
}
