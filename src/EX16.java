package src;
import java.util.Scanner;

public class EX16 {
  public static void main(String[] args) {
    System.out.println("Conversor de KG para Libras:\nInforme o valor desejado em KG para efetuar a conversão:");
    Scanner sc = new Scanner(System.in);
    double kilos = sc.nextDouble();
    sc.close();
    // CONTA
    double conversor = kilos * 2.20462;
    System.err.printf("O valor informado em KG -> Libras é: %.2f", conversor);





    }
}
