package src;
import java.util.Scanner;

public class EX18 {
  public static void main(String[] args) {
    
    System.out.println("Informe sua altura:");
    Scanner sc = new Scanner(System.in);
    double altura = sc.nextDouble();
    sc.nextLine(); // SERVE PARA QUEBRAR A LINHA E PEDIR MAIS UMA ENTRADA NO PRÓXIMO COMANDO!
    System.out.println("Informe seu sexo [H] Homem ou [M] Mulher:");
    String sexo = sc.nextLine().toUpperCase();
    sc.close();
    double pesoHomem = (72.7*altura)- 58;
    double pesoMulher = (62.1*altura)- 44.7;
     
    if (sexo.equals("H")) {
      System.out.printf("O peso ideal para um Homem é: %.2f\n",pesoHomem); 
    }
    else if (sexo.equals("M")) { 
      System.out.printf("O peso ideal para uma Mulher é:%.2f\n",pesoMulher);
    }
    else{
      System.out.println("Atualize a página e digite novamente!");
    }
    
  }
}
