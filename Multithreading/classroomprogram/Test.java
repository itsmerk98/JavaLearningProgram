//package classroomprogram;
class A extends Thread {
	public void run() {
		for(int i=0; i<=5; i++) {
			if(i==1) Thread.yield( );
			System.out.println("Thread A : " + i);
		}
		System.out.println("Exit from A " );
	}
}
class B extends Thread {
	public void run() {
		for(int i=0; i<=5; i++) {
			if(i==1) stop();
				System.out.println("Thread B : " + i);
		}
		System.out.println("Exit from B " );
	}
}
class C extends Thread {
	public void run() {
		for(int i=0; i<=5; i++) {
			if(i==1) {
				try {
					Thread.sleep(5000);
				     } 
  				catch (InterruptedException e) {
					e.printStackTrace();
					}
				}
			System.out.println("Thread C : " + i);
		}
		System.out.println("Exit from C " );
	}
}
class Test {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println("Thread A started ");
		a.start();
		System.out.println("Thread B started ");
		b.start();
		System.out.println("Thread C started ");
		c.start();
		System.out.println("END of main ");

	}
}
