package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
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
            
            for (int i=0; i<arrayInvitatiAutorizzati.length; i++) {
                if (nomeCompleto.equals(arrayInvitatiAutorizzati[i])) {
                    System.out.println(nomeCompleto + ": Accesso CONSENTITO - Benvenuto alla festa!");

                    break;
                } else if (i == arrayInvitatiAutorizzati.length - 1) {
                    // Se l'ospite non è presente nell'array, stampiamo un messaggio di accesso negato
                    System.out.println(nomeCompleto + ": Accesso NEGATO - Non sei nella lista degli invitati.");
                }
            }
        }
    }