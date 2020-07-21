package pratice;

import java.util.ArrayList;

public class ThreadTest2 implements Runnable {

	int seq;

	public ThreadTest2(int seq) {
		this.seq = seq;
	}

	@Override
	public void run() {
		System.out.println(this.seq + " thread start.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(this.seq + " thread end.");
	}

	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new ThreadTest2(i));
			t.start();
			threads.add(t);
		}

		for (int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("main end.");
		}
	}
}
