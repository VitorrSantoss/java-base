package src;
import java.util.Scanner;

public class EX28 {
  public static void main(String[] args) {
    
    System.out.println("Informe o valor a ser depositado:");
    Scanner sc = new Scanner(System.in);
    double real = sc.nextDouble();
    sc.close(); 
    double renda = real  * (0.50/100);
    System.out.printf("Após o 1º mês com juros de 0.50%%, o valor é: R$ %.2f\nTotal: R$ %.2f", renda, renda+real);



  }
}
