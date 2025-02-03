package src;
import java.util.Scanner;

public class EX08 {
  public static void main(String[] args) {
    System.out.println("Quantos R$ você ganha por Hora trabalhada?");
    Scanner sc = new Scanner(System.in);
    double reais = sc.nextDouble();
    System.out.println("Quantas horas você trabalhou no mês?");
    double hora = sc.nextDouble();
    sc.close();
    // CONTA
    double salario = reais * hora;
    System.out.printf("O seu salário ao final do mês será de R$ %.2f", salario);

    
  }
}
