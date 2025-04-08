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

class classRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable is running");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable: " + i);
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

        Thread runnableThread = new Thread(new classRunnable());
        runnableThread.start();

        try {

            thread.join();
            runnableThread.join();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Threds principal finalizada.");
    }
}


