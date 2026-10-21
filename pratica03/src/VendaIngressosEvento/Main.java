package VendaIngressosEvento;

import java.util.Scanner;

import AgendaTelefonica.Agenda;

public class Main {
    public static void main(String[] args) {
        Agenda bilheteriaIngressos = new Agenda();
        Scanner infoScanner = new Scanner(System.in);
        String escolhaScanner = "";

        while(!escolhaScanner.equals("g")){
            System.out.println("MENU\n");
            System.out.println("(a) Cadastrar ingresso");
            System.out.println("(b) Remover ingresso");
            System.out.println("(c) Buscar ingresso por código");
            System.out.println("(d) Listar todos os ingressos ");
            System.out.println("(e) Calcular arrecadação total ");
            System.out.println("(f) Listar benefícios dos ingresso");
            System.out.println("(g) Finalizar");

            escolhaScanner = infoScanner.nextLine();
            
            if(escolhaScanner.equals("g")){
                System.out.println("Finalizando programa...");
                break;
            }

            if(escolhaScanner.equals("a")){
                
            }
        }
    }
}
