import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any word: ");
		String word = sc.next();
		System.out.println("You entered this word: " + word);
		System.out.print("Please, entered integer number: ");
		int i = sc.nextInt();
		System.out.print("Your entered this integer numver: " + i);
	}
}