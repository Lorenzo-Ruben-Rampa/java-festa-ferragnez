package com.ferragnez.party;

public class CheckGuest {
    public static void main(String[] guestName) {
        // Array di tutti i vip che provano ad entrare alla festa 
        String arrayVip [] = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", 
        "Martina Maccherone", "Rachel Zeilic", "Beyoncé", "Leonardo DiCaprio", "Taylor Swift", "Cristiano Ronaldo", "Kim Kardashian", "Elon Musk", 
        "Dwayne Johnson", "Oprah Winfrey", "Tom Cruise", "BTS", "Ramazzotti", "Laura Pausini", "Mario Draghi","Giorgia Meloni", "Roberto Benigni", 
        "Monica Bellucci", "Andrea Bocelli" };

        // Array della lista degli invitati da ammettere alla festa
        String arrayInvitati [] = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei"};
        
        // Array per gli invitati ammessi
        String[] accessiConsentiti = new String[arrayInvitati.length];
        int ammessiIndex = 0;
        
        // Ciclo for per controllare gli accessi
        for (String invitato : arrayInvitati) {
            boolean trovato = false;
            
            for (String vip : arrayVip) {
                if (invitato.equals(vip)) {
                    trovato = true;
                    break;
                }
            }
            
            if (trovato) {
                accessiConsentiti[ammessiIndex++] = invitato;
            }
        }
        
        // Stampiamo la lista degli ammessi
        System.out.println("\nLista degli invitati ammessi:");
        System.out.println("---------------------------");
        for (int i = 0; i < ammessiIndex; i++) {
            System.out.println("- " + accessiConsentiti[i]);
            }
        } 
    }
    

