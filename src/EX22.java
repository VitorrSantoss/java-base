package src;
import java.util.Scanner;

public class EX22 {

  public static void main(String[] args) {
   
    System.out.println("Informe quantos m² a ser pintado:");
    Scanner sc = new Scanner(System.in);
    double area = sc.nextDouble();
    sc.close();

    // SITUAÇÃO 1: LATAS
    double lataLitro1 = 18;
    double lataCobertura1 = 6;
    double qtdLitroNecessario1 = area / lataCobertura1;
    int qtdLata1 = (int) Math.ceil(qtdLitroNecessario1/lataLitro1);
    double lataValor1 = qtdLata1*80;
    System.out.printf("Latas necessárias: %d\nValor a ser pago: R$ %.2f\n", qtdLata1, lataValor1);
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    // SITUAÇÃO 2: GALÃO
    double galaoLitro2 = 3.6;
    double galaoCobertura2 = 6;
    double qtdLitroNecessario2 = area / galaoCobertura2;
    int qtdgalao2 = (int) Math.ceil(qtdLitroNecessario2/galaoLitro2);
    double galaoValor2 = qtdgalao2*25;
    System.out.printf("Galões necessários: %d\nValor a ser pago: R$ %.2f\n", qtdgalao2, galaoValor2);
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    // SITUAÇÃO 3: LATAS E GALÕES:
    double volumeTinta = 1.1 * area / 6;
    int qtdLata3 = (int) volumeTinta / 18;
    double resto = volumeTinta % 18;
    int qtdeGaloes3 = (int) Math.ceil(resto / 3.6);
    double valorTotal3 =  lataValor1 + galaoValor2;
    
    System.out.printf("Você precisa de %d latas de tinta.\n", qtdLata3);
    System.out.printf("Você precisa de %d galões de tinta.\n", qtdeGaloes3);
    System.out.printf("Valor a ser pago: R$ %.2f\n", valorTotal3);


   
  }
}
