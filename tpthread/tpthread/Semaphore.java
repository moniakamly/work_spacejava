package tpthread;
class Semaphore {
	private int permits; // nombre de jetons disponibles
	
	public Semaphore(int initialPermits) {
		permits = initialPermits;
	}
	public synchronized void acquire() {
		permits = permits - 1;
		if (permits <0)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public synchronized void release() {
		permits = permits + 1;
		if (permits <= 0) notify();
	}
}
