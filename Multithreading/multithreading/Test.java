package multithreading;
class Test {
	
	public static void main(String[] args) {
		
		System.out.println("\n===Application started.=== \n");
		
		Printer printer = new Printer();
		MyThread task = new MyThread(printer);
		task.start();
		
		System.out.println("\n===Application Finished.=== \n");	
	}
}
class Printer {
	public void printDocuments(int numOfCopies, String docName) {
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