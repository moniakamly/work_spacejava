package tpthread;
import java.util.Random;

public class CarPark {

	private int capacity;

	public CarPark(int capacity) {
		this.capacity = capacity;
	}

	public void arrive() {
		System.out.println(Thread.currentThread().getName() + " arrive");
		while (capacity == 0) 
				System.out.println(Thread.currentThread().getName() + " attend...");
		// à compléter...
		System.out.println(Thread.currentThread().getName()
				+ " entre dans le parking [il reste " + capacity + " place(s)]");
	}

	public synchronized void depart() {
		System.out.println(Thread.currentThread().getName() + " repart");
		// à compléter...
	}

	public static void main(String args[]) {
		int NBPLACES = 4;
		CarPark carpark = new CarPark(NBPLACES);
		Random r = new Random();
		
		for (int i=0; i<100; i++) {
			try {
				Thread.sleep(r.nextInt(5) * 1000);
			} catch (InterruptedException e) {
			}
			new Thread(new Cars("Voiture"+i, carpark)).start();
		}
	}
}
