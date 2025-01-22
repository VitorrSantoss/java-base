import java.util.Scanner;

public class EX26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double maçaPreço5KG = 1.80;
    double maçaPreço6KG = 1.50;
    double desconto = 0.10;
    double morangoPreço5KG = 2.50;
    double morangoPreço6KG = 2.20;
       
    System.out.println("Quer MAÇÃ?");
    String decisão = sc.nextLine().toLowerCase();

    if (decisão.equals("sim")){
      System.out.println("Quantos KG?");
      double maçãKG = sc.nextDouble();
      if (maçãKG <=5){
        double preçoMaçã = maçãKG * maçaPreço5KG;
        System.out.printf("Total a Pagar: R$ %.2f\n", preçoMaçã);
      }
      if (maçãKG > 5 && maçãKG <8){
        double preçoMaçã = maçãKG * maçaPreço6KG;
        double descontoMaçã = preçoMaçã * desconto;
        double valorApagar = preçoMaçã - descontoMaçã;
        System.out.printf("Preço: R$ %.2f\n", preçoMaçã);
        System.out.printf("Desconto: R$ %.2f\n", descontoMaçã);
        System.out.printf("Total a Pagar: R$ %.2f\n", valorApagar);
      }
      if ((maçãKG >8)){
        double preçoMaçã = maçãKG * maçaPreço6KG;
        double descontoMaçã = preçoMaçã * desconto;
        double valorApagar = preçoMaçã - descontoMaçã;
        System.out.printf("Preço: R$ %.2f\n", preçoMaçã);
        System.out.printf("Desconto: R$ %.2f\n", descontoMaçã + (descontoMaçã * desconto));
        System.out.printf("Total a Pagar: R$ %.2f\n", valorApagar - (descontoMaçã * desconto) );
      }
    }

    System.out.println("Quer MORANGO?");
    String decisão2 = sc.nextLine();

    if (decisão2.equals("sim")){
      System.out.println("Quantos KG?");
      double morangoKG = sc.nextDouble();
      if (morangoKG <=5){
        double preçoMorango = morangoKG * morangoPreço5KG;
        System.out.printf("Total a Pagar: R$ %.2f\n", preçoMorango);
      }
      if (morangoKG > 5 && morangoKG <8){
        double preçoMorango = morangoKG * morangoPreço6KG;
        double descontoMorango = preçoMorango * desconto;
        double valorApagar = preçoMorango - descontoMorango;
        System.out.printf("Preço: R$ %.2f\n", preçoMorango);
        System.out.printf("Desconto: R$ %.2f\n", descontoMorango);
        System.out.printf("Total a Pagar: R$ %.2f\n", valorApagar);
      }
      if ((morangoKG >8)){
        double preçoMorango = morangoKG * morangoPreço6KG;
        double descontoMorango = preçoMorango * desconto;
        double valorApagar = preçoMorango - descontoMorango;
        System.out.printf("Preço: R$ %.2f\n", preçoMorango);
        System.out.printf("Desconto: R$ %.2f\n", descontoMorango + (descontoMorango * desconto));
        System.out.printf("Total a Pagar: R$ %.2f\n", valorApagar - (descontoMorango * desconto) );
      }
    }
      





  }





}






































































/*import java.util.Scanner;
                                                                     SECÇÃO 5 QUESTÃO 12
public class EX26 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Características de Animais:");
    System.out.println("vertebrado ou invertebrado?");
    String palavra = sc.nextLine().toLowerCase();

    if (palavra.equals("vertebrado")){
      System.out.println("ave ou mamifero");
      String palavra1 = sc.nextLine().toLowerCase();
      if (palavra1.equals("ave")){                 
        System.out.println("carnivoro ou onivoro");
        String palavra2 = sc.nextLine().toLowerCase();
        if (palavra2.equals("carnivoro")){
          System.out.println("aguia");
        }
        else if (palavra2.equals("onivoro")){
          System.out.println("pomba");
        }
      }
      if (palavra.equals("vertebrado")){
        if (palavra1.equals("mamifero")){                 
          System.out.println("onivero ou herbivoro");
          String palavra2 = sc.nextLine().toLowerCase();
          if (palavra2.equals("onivero")){
            System.out.println("homem");
          }
          else if (palavra2.equals("herbivoro")){
            System.out.println("vaca");
          }
        }
      }
    }
    if (palavra.equals("invertebrado")){
      System.out.println("inseto ou anelideo");
      String palavra1 = sc.nextLine().toLowerCase();
      if (palavra1.equals("inseto")){                 
        System.out.println("hematofago ou herbivoro");
        String palavra2 = sc.nextLine();
        if (palavra2.equals("hematofago")){
          System.out.println("pulga");
        }
        else if (palavra2.equals("herbivoro")){
          System.out.println("largata");
        }
      }
      if (palavra.equals("invertebrado")){
        if (palavra1.equals("anelideo")){                 
          System.out.println("hematofago ou onivero");
          String palavra2 = sc.nextLine().toLowerCase();
          if (palavra2.equals("hematofago")){
            System.out.println("sanguessuga");
          }
          else if (palavra2.equals("onivero")){
            System.out.println("minhoca");
          }
        }
      }
    }
    sc.close();
  }
}*/









































