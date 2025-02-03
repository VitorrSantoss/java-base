package src;
import java.util.Scanner;

public class EX19 {
  public static void main(String[] args) {
    
    System.out.println("Informe o peso de peixes!");
    Scanner sc = new Scanner(System.in);
    double pesoPeixes = sc.nextDouble();
    sc.close();

     if (pesoPeixes > 50) {
      double pesoExcedente = (pesoPeixes - 50) * 4;
      System.out.printf("O valor da multa por excesso de peos por KG é R$ %.2f", pesoExcedente);
      
      
    } else{
      System.out.println("Peso detro do regulamento!");
    }

  }
}
