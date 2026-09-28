package dev.lieno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Thread> corridori = new ArrayList<Thread>();
        
        Scanner in = new Scanner(System.in);

        System.out.println("Quanti atleti devono competere?");
        int num = in.nextInt();

        in.nextLine();
        
        for(int i=1; i<=num; i++) {
            System.out.println("Inserisci il nome del corridore " + i);
            String name = in.nextLine();

            corridori.add(new Thread(new Corridore(name)));
        }

        in.close();

        for(Thread t: corridori) {
            t.start();
        }

        for(Thread t: corridori) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}