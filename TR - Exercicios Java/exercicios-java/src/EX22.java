import java.util.Scanner;

public class EX22 {

  public static void main(String[] args) {
    
    
    // Tamanho em metros quadrados da área a ser pintada!
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe em metros o tamanho da área a ser pintada:");
    int metrosQuadrados = sc.nextInt();
    sc.close();
    System.out.printf("A área a ser pintada possui %d m²\n", metrosQuadrados);
    
    // Dados da tinta - LATA!
    int coberturaLata = 6; // 1L -> 6 m²
    int tamanhoDaLata = 18; // litros -> 108 m²
    int valorLata = 80; // valor da lata
    int qtdLata = metrosQuadrados/coberturaLata/tamanhoDaLata;
    int pagarLata = qtdLata * valorLata;
    System.out.printf("Será necessário: %.2f latas\nO valor a ser pago será: R$ %d\n", qtdLata, pagarLata);
  
    // Dados da tinta - GALÃO!
    int coberturaGalao = 6; // 1L -> 6 m²
    double tamanhoGalao = 3.6; // litros -> 21.6 m²
    int valorGalao = 25; // valor do galão
    int qtdGalao = (int)(metrosQuadrados/coberturaGalao/tamanhoGalao);
    int pagarGalao = qtdGalao * valorGalao;
    System.out.printf("Será necessário: %d galão\nO valor a ser pago será: R$ %d\n", qtdGalao, pagarGalao);
      














  }
}
