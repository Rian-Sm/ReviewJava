package ThreadsJava;

class  ClassThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(500); // Pausa de 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BasicThread {

    public static void main(String[] args) {
        
        ClassThread thread = new ClassThread();
        thread.start();

    }

}


