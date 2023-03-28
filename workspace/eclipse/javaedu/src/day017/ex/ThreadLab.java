package day017.ex;

public class ThreadLab {
	
	public static void main(String[] args) throws Exception {
		CapThread ct = new CapThread();
		SmallThread st = new SmallThread();
		IntThread it = new IntThread();
		StringThread srt = new StringThread();
		
		ct.start();
		st.start();
		it.start();
		srt.start();
		
		ct.join();
		st.join();
		it.join();
		srt.join();
		System.out.println("MAIN 수행 종료");
	}
}

class CapThread extends Thread {
	public void run() {
	for(int i= 1; i <= 12; i++) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println((char)(i + 64));
	}
	}
}

class SmallThread extends Thread {
	public void run() {
		for(int i= 1; i <= 8; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			System.out.println((char)(i + 96));
		}
		}
}

class IntThread extends Thread {
	public void run() {
		for(int i= 1; i <= 30; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i);
		}
		}
}

class StringThread extends Thread {
	public void run() {
		for(int i= 1; i <= 10; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			System.out.println("JAVA");
		}
		}
}