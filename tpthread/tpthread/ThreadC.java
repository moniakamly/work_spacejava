package tpthread;
public class ThreadC extends Thread {
	Semaphore mutexC; 
	Semaphore mutexB; 
	Semaphore mutexA; 
	
	public ThreadC(Semaphore mutexC, Semaphore mutexB, Semaphore mutexA) {
		this.mutexC = mutexC; 
		this.mutexB = mutexB; 
		this.mutexA = mutexA; 
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			mutexC.acquire();
			System.out.print("C");
			mutexA.release();
		}
	}
}
