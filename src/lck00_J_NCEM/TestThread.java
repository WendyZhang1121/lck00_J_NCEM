package lck00_J_NCEM;

public class TestThread implements Runnable {

		public void run() {
			// Untrusted code
			SomeObject someObject = new SomeObject(); 
			synchronized (someObject) {
			while (true) {
			// Indefinitely delay someObject 
				try {
					Thread.sleep(Integer.MAX_VALUE);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				} 
			}
		}
		public static void main(String[] args) throws Exception { 
			
			TestThread t = new TestThread();
			Thread t1 = new Thread(t);
			Thread t2 = new Thread(t);
			Thread t3 = new Thread(t);
			t1.start();
			t2.start();
			t3.start();
		}
}
