package tpthread;
public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a runnable thread!");
    }
    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }
}
