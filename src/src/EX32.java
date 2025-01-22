package src;
import java.util.Scanner;

public class EX32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Preço de custo do produto! R$ ");
    double custoProduto = sc.nextDouble();
    System.out.print("Informe o percentual de acréscimo: ");
    double acrescimoPreco = sc.nextDouble() * 0.1;
    double conta = custoProduto * acrescimoPreco;
    sc.close();
    System.out.printf("O valor de venda do produto será: R$ %.0f", conta);
  }
}
