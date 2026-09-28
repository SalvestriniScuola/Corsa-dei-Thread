package dev.lieno;

public class Corridore extends Thread {
    private String name;

    @Override 
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println( name + " ha fatto il passo " + i );
                try {
                    Thread.sleep((int)(Math.random()*200+600));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

        System.out.println( name + " è arrivato al traguardo!");
    }
}
