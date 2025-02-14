import java.util.ArrayList;
import java.util.Scanner;

public class Desafio02TreinaRecife {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true){
            // COLETA DOS NOMES!
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine().toUpperCase();
            // SAIR DO LAÇO!
            if (nome.equals("SAIR")){
                break;
            }
            // VERIFICAÇÃO DE NOMES E CHECKIN!
            if (lista.contains(nome)){
                System.out.printf("%s, Já efetuou o CheckIn!\n", nome);
            }
            // ADIÇÃO DE NOMES NA LISTA!
            lista.add(nome);
        }
        sc.close();
        // NOMES QUE REALIZARAM O CHECKIN
        System.out.println("Realizaram o CheckIn!");
        for(String registro: lista){
            System.out.println(registro);
        }
    }
}
