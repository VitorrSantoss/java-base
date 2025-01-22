package src;
import java.util.Scanner;

public class EX30 {
  public static void main(String[] args) {
    
    System.out.println("Informe seu nome:");
    Scanner sc = new Scanner(System.in);
    String nomeVendedor = sc.nextLine();
    System.out.println("Informe seu salário fixo:");
    double salarioFixo = sc.nextDouble();
    System.out.println("Informe o total de vendas em R$:");
    double totalVendas = sc.nextDouble();
    System.out.println("Informe sua comissão em R$:");
    double comissao = totalVendas * 0.15;
    double salarioLiquido = salarioFixo + comissao;
    sc.close();

    System.err.printf("Nome: %s\nSalário fixo: R$ %.2f\nTotal de vendas: R$ %.2f\nComissão: R$ %.2f\nSalário Líquido: R$ %.2f", nomeVendedor, salarioFixo, totalVendas, comissao, salarioLiquido);














  }
}
