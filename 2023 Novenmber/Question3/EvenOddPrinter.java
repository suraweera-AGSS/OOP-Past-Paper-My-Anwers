package Question3;

public class EvenOddPrinter {
	
	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 1;
	private static final Object lock = new Object();
	
	public static void main(String[] args) {
		Thread evenThread = new Thread(new EvenRunnable(), "EvenThread");
		Thread oddThread = new Thread(new OddRunnable(), "OddThread");

		evenThread.start();
		oddThread.start();
		
		try {
			evenThread.join();
			oddThread.join();
		} catch (InterruptedException e) {
//			Thread.currentThread().interrupt();
		}
	}
	
	static class EvenRunnable implements Runnable {
		@Override
		public void run() {
			while (nextNum <= MAX_NUM) {
				synchronized (lock) {
					while (nextNum % 2 != 0) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
//							Thread.currentThread().interrupt();
						}
					}
					System.out.println(Thread.currentThread().getName() + " " + nextNum);
					nextNum++;
					lock.notify();
				}
			}
		}
	}
	
	static class OddRunnable implements Runnable {
		@Override
		public void run() {
			while (nextNum <= MAX_NUM) {
				synchronized (lock) {
					while (nextNum % 2 == 0) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
//							Thread.currentThread().interrupt();
						}
					}
					System.out.println(Thread.currentThread().getName() + " " + nextNum);
					nextNum++;
					lock.notify();
				}
			}
		}
	}
}
