package src;
import java.util.Scanner;

public class EX20 {
  public static void main(String[] args) {
    
    System.out.println("Quantos R$ você ganha por HORA?");
    Scanner sc = new Scanner(System.in);
    double valorHora = sc.nextDouble();
    System.out.println("Quantas horas trabalhadas no mês?");
    double horaMes = sc.nextDouble();
    sc.close();
    double salario = valorHora * horaMes;
    System.out.printf("Seu salário bruto é: R$ %.2f\n", salario);
    double impostoRenda = salario * 0.11;
    double inss = salario * 0.08;
    double sindicato = salario * 0.05;
    double salarioLiquido = salario - impostoRenda - inss - sindicato;
    double totalDescontos = impostoRenda + inss + sindicato;
    System.out.printf("Descontos do seu salário:\nImposto de Renda: R$ %.2f\nINSS: R$ %.2f\nSindicato: R$ %.2f\n", impostoRenda, inss, sindicato);
    System.out.printf("Seu salário líquido é: R$ %.2f\n", salarioLiquido);
    System.out.printf("Total de descontos ficou em R$ %.2f", totalDescontos);
    
  }
}
