package tpthread;
public class Main {
	public static void main(String args[]) {
		Semaphore mutexA = new Semaphore(1);
        Semaphore mutexB = new Semaphore(0);
        Semaphore mutexC = new Semaphore(0);
		
		new ThreadA(mutexA,mutexB,mutexC).start();
		new ThreadB(mutexB,mutexA,mutexC).start();
		new ThreadC(mutexC,mutexB,mutexA).start();
	}
}
