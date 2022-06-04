package firstthread;
class Test {
	public static void main(String[] args) {
		
		System.out.println("\n>>> Application starting @@ \n" );

		//MyTask task = new MyTask();
		//task.executeTask();
		//task.start();

		for(int i=0;i<=10;i++) {
			System.out.println("### Printing Document @ " + i + " - Main class. " );
		}
		
		System.out.println("\n>>> Application Finished @@ " );
	}
}
class MyTask extends Thread {
	public void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("@@@ Printing Document # " + i + " - MyTask class. ");
		}
	}
}
class Alfa {
	void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("$$$ Printing Document # " + i + " - Alfa Class. ");
		}
	}
}
