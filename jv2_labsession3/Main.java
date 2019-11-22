package jv2_labsession3;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 10; i >= 0; i--) {
                try {
                    System.out.println(i);
                    Thread.sleep(100);
                    if (i == 0){
                        System.out.println("chuc mung");
                    }
                } catch (Exception e) {

                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
