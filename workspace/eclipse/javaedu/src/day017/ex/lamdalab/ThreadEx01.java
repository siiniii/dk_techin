package day017.ex.lamdalab;

class ThreadEx01 {
	
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Thread t2 = new Thread(() -> { for (int i = 0; i < 5; i++) System.out.println(Thread.currentThread().getName());});
		
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
		}
	}
}

// class ThreadEx1_2 {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
//			System.out.println(Thread.currentThread().getName());
//		}
//	}

// }
