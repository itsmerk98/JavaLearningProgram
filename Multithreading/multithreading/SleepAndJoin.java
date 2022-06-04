package multithreading;
class M_Test {
	
	public static void main(String[] args) {
		
		System.out.println("\n===Application started.=== \n");
		
		Printer printer = new Printer();
		MyThread MyRef = new MyThread(printer);
		YourThread YourRef = new YourThread(printer);
		MyRef.start();
		try {
			MyRef.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		YourRef.start();

		System.out.println("\n===Application Finished.=== \n");	
	}
}
class Printer {
	public void printDocuments(int numOfCopies, String docName) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<=numOfCopies; i++) {
			System.out.println(">>> Printing " + docName + " " + i );
		}
	}
}
class MyThread extends Thread {
	Printer P_Ref;
	
	MyThread(Printer P) {
		P_Ref = P;
	}
	
	public void run(){
		P_Ref.printDocuments(10,"CoffeeProfile.pdf");
	}
}
class YourThread extends Thread {
	Printer P_Ref;
	
	YourThread(Printer P) {
		P_Ref = P;
	}
	
	public void run(){
		P_Ref.printDocuments(10,"TeaProfile.pdf");
	}
}