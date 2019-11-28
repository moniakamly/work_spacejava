package tpthread;
public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
 		   try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Bye from the thread!");
    }
    
    public static void main(String args[]) {
        (new HelloThread()).start();
    }
}
