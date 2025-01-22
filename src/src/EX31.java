package src;
import java.util.Scanner;

public class EX31 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe sua idade em anos:");
    int anos = sc.nextInt();
    System.out.println("Informe sua idade em meses:");
    int meses = sc.nextInt();
    System.out.println("Informe sua idade em dias:");
    int dias = sc.nextInt();
    sc.close();

    int idade = (anos * 360) + (meses * 30) + dias;
    System.out.printf("Sua idade em dias é: %d", idade);
  

  }
}
