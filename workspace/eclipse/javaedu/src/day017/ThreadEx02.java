package day017;

class ThreadEx02 {
	public static void main(String args[]) throws Exception {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
	}
}

class ThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// 새롭게 기동된 자식의 콜스텍
			e.printStackTrace();
		}
	}
}
