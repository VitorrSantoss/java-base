package src;
import java.util.Scanner;

public class EX33 {

  public static void main(String[] args) {
    // PERCENTAGEM IMPOSTOS
    double imposto = 45.0/100;
    // PERCENTAGEM DISTRIBUIDOR
    double distribuidor = 28.0/100;
    // CUSTO DO CARRO NOVO -> CUSTO DA FÁBRICA
    System.out.println("Informe o custo da fábrica para a fabricação de um carro novo: R$ ");
    Scanner sc = new Scanner(System.in);
    double custoFabrica = sc.nextDouble();
    sc.close();
    double impostoFabrica = custoFabrica * imposto;
    double distribuidorFabrica = (custoFabrica+ impostoFabrica) * distribuidor;
    double custoTotal = custoFabrica + impostoFabrica + distribuidorFabrica;
    System.out.printf("Custo Fábrica: R$ %.2f\nDesconto Imposto: R$ %.2f\nDesconto Distribuidor: R$ %.2f\nCusto total: R$ %.2f", custoFabrica, impostoFabrica, distribuidorFabrica, custoTotal);
    
  }
}
  

  






