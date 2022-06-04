package javaclass;
class Methods{
	
	String animal;
	int value;
	
	void run() {
		System.out.println("Running");
		for(int i=0; i<4; i++) {
			System.out.println("My " + animal + " is " + value + " years old.");
		}
	}
}
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods name = new Methods();
		name.animal = "Cat";
		name.value = 9;
		name.run();
	}
}
