package tpthread;
public class ThreadA extends Thread {
	Semaphore mutexA;
	Semaphore mutexB;
	Semaphore mutexC; 
	
	public ThreadA(Semaphore mutexA, Semaphore mutexB, Semaphore mutexC) {
		this.mutexA = mutexA;
		this.mutexB = mutexB; 
		this.mutexC = mutexC; 

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			mutexA.acquire();
			System.out.print("A");
			mutexB.release();
		}
	}
}
