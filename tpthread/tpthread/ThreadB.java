package tpthread;
public class ThreadB extends Thread {
	Semaphore mutexB;
	Semaphore mutexA; 
	Semaphore mutexC; 
	
	public ThreadB(Semaphore mutexB, Semaphore mutexA, Semaphore mutexC) {
		this.mutexB = mutexB; 
		this.mutexA = mutexA; 
		this.mutexC = mutexC; 
		
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			mutexB.acquire();
			System.out.print("B");
			mutexC.release();
		}
	}
}
