package day8;

abstract class Pet {
	public abstract void petSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Dog extends Pet {
	public void petSound() {
		System.out.println("멍멍!!");
	}
}

class Cat extends Pet {
	public void petSound() {
		System.out.println("야옹~~");
	}
}

public class PetTest {
	public static void main(String[] args) {
		actionPet(new Dog());
		actionPet(new Cat());
	}

	// pet을 상속하고 있다면 누구든지 전달 가능
	static void actionPet(Pet obj) {
		obj.petSound(); // 펫을 상속하여 petSoun를 옳바르게 오버라이딩을 한 객체만
		obj.sleep();
	}
}
