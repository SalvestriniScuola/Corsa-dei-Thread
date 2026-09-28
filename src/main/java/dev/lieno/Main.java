package dev.lieno;

public class Main {
    public static void main(String[] args) {
        Corridore mark = new Corridore("mark");
        Corridore piliph = new Corridore("piliph");

        Thread r1 = new Thread(mark);
        Thread r2 = new Thread(piliph);


        r1.run();
        r2.run();
        
        try {
            r1.join();
            r2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}