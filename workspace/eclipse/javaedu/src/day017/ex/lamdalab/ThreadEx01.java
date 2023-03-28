package day017.ex.lamdalab;

class ThreadEx01 {
	
	public static void main(String args[]) {
		Runnable r1 = new ThreadEx1_1().r;
		Thread t1 = new Thread(r1); // 생성자 Thread(Runnable target)
		Runnable r2 = new ThreadEx1_2().r;
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
//		}
//	}
	Runnable r = () -> { for (int i = 0; i < 5; i++) System.out.println(Thread.currentThread().getName());};
}

class ThreadEx1_2 {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
	Runnable r = () -> { for (int i = 0; i < 5; i++) System.out.println(Thread.currentThread().getName());};
}
