package src;
import java.util.Scanner;

public class EX25 {
  public static void main(String[] args) {
    
    System.out.println("Digite dois números inteiros:");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    sc.nextLine();
    System.out.println("Agora digite um número decimal:");
    
    double num3 = sc.nextDouble();
    sc.close();

    // O produto do dobro do primeiro com metade do segundo.
    int a = (num1*2)*(num2/2);
    // A soma do triplo do primeiro com o terceiro.
    double b = (int) Math.pow(num1, 3) + num3;
    // O terceiro elevado ao cubo.
    double c = Math.pow(num3, 3);

    System.out.printf("O produto do dobro do primeiro com a metade do segundo: %d\nA soma do triplo do primeiro com o terceiro: %.1f\nO terceiro elevado ao cubo: %.1f",a, b, c);




  }
}
