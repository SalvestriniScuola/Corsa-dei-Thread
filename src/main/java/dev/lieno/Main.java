package dev.lieno;

public class Main {
    public static void main(String[] args) {
        Corridore mark = new Corridore("mark");
        Corridore piliph = new Corridore("piliph");

        mark.start();
        piliph.start();

        try {
            mark.join();
            piliph.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}