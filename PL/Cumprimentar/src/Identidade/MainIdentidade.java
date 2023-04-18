package Identidade;

import java.util.Scanner;


public class MainIdentidade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 /*EX1
        System.out.println("Insirta o seu nome --> ");
        String nome = ler.nextLine();
        System.out.println("Olá " + nome);
 */
        Identidade a = new Identidade();
        System.out.println("Insira o seu nome --> ");
        a.setNome(ler.nextLine());

        System.out.println("Insira a sua idade --> ");
        a.setIdade(ler.nextByte());
        System.out.println(a.toString());



    }

}
