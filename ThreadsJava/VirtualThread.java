package ThreadsJava;

public class VirtualThread {
    public static void main(String[] args) {
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Virtual thread is running");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Virtual thread: " + i);
                try {
                    Thread.sleep(500); // Pausa de 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        try {
            virtualThread.join(); // Aguarda a conclusão da thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}   
