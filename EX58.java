import java.util.Scanner;

public class EX58 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira dois números:");
    System.out.print("1º Número: ");
    int num1 = sc.nextInt();
    System.out.print("2º Número: ");
    int num2 = sc.nextInt();
    
    System.out.println("Qual operação você deseja realizar?");
    System.out.println("Digite [1] -> Soma.\nDigite [2] -> Subtração.\nDigite [3] -> Divisão.\nDigite [4] -> Multiplicação.");
    System.out.print("Opção: ");
    int opcao = sc.nextInt();
    sc.close();

    int soma = num1 + num2;
    int subtração = num1 - num2;
    int divisao = num1 / num2;
    int multiplicação = num1 * num2;

    if (opcao == 1 && soma % 2 == 0 && soma > 0)
      System.out.printf("Soma: %d + %d = %d -> O número é PAR e POSITIVO", num1, num2, soma);
    else if (opcao == 1 && soma % 2 == 0 && soma < 0){
      System.out.printf("Soma: %d + %d = %d -> O número é PAR e NEGATIVO", num1, num2, soma);
    }
    else if (opcao == 1 && soma % 2 != 0 && soma > 0){
      System.out.printf("Soma: %d + %d = %d -> O número é ÍMPAR e POSITIVO", num1, num2, soma);
    }
    else if (opcao == 1 && soma % 2 != 0 && soma < 0){
      System.out.printf("Soma: %d + %d = %d -> O número é ÍMPAR e NEGATIVO", num1, num2, soma);
    }
    else if (opcao == 2 && subtração % 2 == 0 && subtração > 0){
      System.out.printf("Subtração: %d - %d = %d -> O número é PAR e POSITIVO", num1, num2, subtração);
    }
    else if (opcao == 2 && subtração % 2 == 0 && subtração < 0){
      System.out.printf("Subtração: %d - %d = %d -> O número é PAR e NEGATIVO", num1, num2, subtração);
    }
    else if (opcao == 2 && subtração % 2 != 0 && subtração > 0){
      System.out.printf("Subtração: %d - %d = %d -> O número é ÍMPAR e POSITIVO", num1, num2, subtração);
    }
    else if (opcao == 2 && subtração % 2 != 0 && subtração < 0){
      System.out.printf("Subtração: %d - %d = %d -> O número é ÍMPAR e NEGATIVO", num1, num2, subtração);
    }
    else if (opcao == 3 && divisao % 2 == 0 && divisao > 0){
      System.out.printf("Divisão: %d / %d = %d -> O número é PAR e POSITIVO", num1, num2, divisao);
    }
    else if (opcao == 3 && divisao % 2 == 0 && divisao < 0){
      System.out.printf("Divisão: %d / %d = %d -> O número é PAR e NEGATIVO", num1, num2, divisao);
    }
    else if (opcao == 3 && divisao % 2 != 0 && divisao > 0){
      System.out.printf("Divisão: %d / %d = %d -> O número é ÍMPAR e POSITIVO", num1, num2, divisao);
    } 
    else if (opcao == 3 && divisao % 2 != 0 && divisao < 0){
      System.out.printf("Divisão: %d / %d = %d -> O número é ÍMPAR e NEGATIVO", num1, num2, divisao);
    }
    else if (opcao == 4 && multiplicação % 2 == 0 && multiplicação > 0){
      System.out.printf("Multiplicação: %d x %d = %d -> O número é PAR e POSITIVO", num1, num2, multiplicação);
    }
    else if (opcao == 4 && multiplicação % 2 == 0 && multiplicação < 0){
      System.out.printf("Multiplicação: %d x %d = %d -> O número é PAR e NEGATIVO", num1, num2, multiplicação);
    }
    else if (opcao == 4 && multiplicação % 2 != 0 && multiplicação > 0){
      System.out.printf("Multiplicação: %d x %d = %d -> O número é ÍMPAR e POSITIVO", num1, num2, multiplicação);
    }
    else if (opcao == 4 && multiplicação % 2 != 0 && multiplicação < 0){
      System.out.printf("Multiplicação: %d x %d = %d -> O número é ÍMPAR e NEGATIVO", num1, num2, multiplicação);
    }
  }
}
