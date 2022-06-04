import java.util.*;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for fabonacci series : ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int i = 0;
		System.out.print("Fabonacci series : ");
		while(i<=num) {
			System.out.print(" " + a);
			sum = a + b;
			i++;
			a = b;
			b = sum;
		}
	}
}