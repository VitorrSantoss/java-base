package src;
import java.util.Scanner;

public class EX21 {
  public static void main(String[] args) {
    
    System.out.println("Qual é o tamanho em metros quadrados da área a ser pintada?");
    Scanner sc = new Scanner(System.in);
    double tamanhoArea = sc.nextDouble();
    sc.close();
    System.out.println("Uma lata de tinta custa R$ 80 e possui 18l");
    double lataLitro = 18;
    double lataMetros = 3;
    double lataPreco = 80;
    System.out.printf("Metros quadrados a ser pintado: %.2f\n",tamanhoArea);
    System.out.printf("Quantidada de latas necessarias: %.2f\n", (tamanhoArea/lataMetros)/lataLitro);
    System.out.printf("O total a ser pago é R$ %.2f",((tamanhoArea/lataMetros)/lataLitro)*lataPreco);

  }
}
