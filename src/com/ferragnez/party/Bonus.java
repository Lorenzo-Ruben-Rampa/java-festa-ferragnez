package com.ferragnez.party;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] guestName) {

        String nome;
        String cognome;

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        nome = input.nextLine();
             
        System.out.println("Inserisci il tuo cognome: ");
        cognome = input.nextLine();

        String nomeCompleto = nome + " " + cognome;

        // Array degli invitati autorizzati
        String[] arrayInvitatiAutorizzati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", 
                                 "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", 
                                 "Pardis Zarei"};
        
        System.out.println("Verifica accessi alla festa Ferragnez:");
        System.out.println("-------------------------------------");
        boolean trovato = false;
        int i = 0;
        while (i<arrayInvitatiAutorizzati.length) {
            if (nomeCompleto.equals(arrayInvitatiAutorizzati[i])) {
            System.out.println(nomeCompleto + ": Accesso CONSENTITO - Benvenuto alla festa!");

                trovato = true;
                break;
            }
            i++;

            }   if (!trovato) {
                    System.out.println(nomeCompleto + ": Accesso NEGATO - Non sei nella lista degli invitati.");
        }
    }
}

