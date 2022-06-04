class Thread_Test {
     public static void main(String args[]) {
	
	Thread_Test t = new Thread_Test();
	t.print_number();
     }
}

class Alfa {
     void print_number(){
	for(int i=1; i<=10; i++) {
	   System.out.println("value is : " + i); 
	}
     }
}