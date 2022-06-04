class LambdaTest {
	public static void main(String[] args) {
//		Calc.addSomething(10,30);
		// 1, refering to a static method
		Calculator cRef = Calc::addSomething; // method Reference
		cRef.add(21,40);
	}
}
interface Calculator {
	void add(int num1, int num2);
}
class Calc {
	public static void addSomething(int num1, int num2) {
		System.out.println(num1 + " and " + num2 +" addition is : " + (num1+num2));
	}
}
