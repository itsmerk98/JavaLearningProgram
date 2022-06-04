package multithreading;
class Clz {
	public static void main(String[] args) {
		System.out.println("==App starting====");

		new A().start();
		new B().start();
		new C().start();

		System.out.println("===App Finished===");
	}
}
class A extends Thread {
	public void run(){
		for(int i = 0; i<=10; i++) {
			System.out.println(">>> Printing class A @ " + i );
		}
	}
}
class B extends Thread {
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println(">>> Printing class B @ " + i );
		}
	}
}
class C extends Thread {
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println(">>> Printing class C @ " + i );
		}
	}
}