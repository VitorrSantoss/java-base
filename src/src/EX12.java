package src;
import java.util.Scanner;

public class EX12 {
  public static void main(String[] args) {
    System.out.println("Informe o raio da base do cinlindro:");
    Scanner sc = new Scanner(System.in);
    double raioBase = sc.nextDouble();
    System.out.println("Infomre a altura do cilindro:");
    double altura = sc.nextDouble();
    sc.close();
    // CÁLCULO:
    double volume = 3.14 * altura * Math.pow(raioBase, 2);
    System.out.printf("Com os dados informados o CILINDRO possui...\nAltura: %.2f\n Raio da base %.2f\nVolume: %.2f",altura, raioBase, volume);
  }
  
}
