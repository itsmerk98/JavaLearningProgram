class Operaters{
	public static void main(String[] args){
		System.out.println("Unary Arithmetic Operaters ! ");
		int a = +10; 
		int b = -10;
		int c = ++a;
		int d = a++;
		int e = --a;
		int f = a--;

		System.out.println("Value for a : " + a);	// 10
		System.out.println("Value for b : " + b);	// -10
		System.out.println("Value for c : " + c);	// 11
		System.out.println("Value for d : " + d);	// 11
		System.out.println("Value for e : " + e);	// 11
		System.out.println("Value for f : " + f);	// 10

		System.out.println("Bnary Arithmetic Operaters ! ");
		
		int a1 = 10 + 1;
		int b1 = a1 - 1;
		int c1 = b1 / 2;
		int d1 = c1 % 2;
		int e1 = 5 % 10;
		int f1 = d1 * 3;
		
		System.out.println("Value for a1 : " + a1);	// 11
		System.out.println("Value for b1 : " + b1);	// 10 
		System.out.println("Value for c1 : " + c1);	// 5
		System.out.println("Value for d1 : " + d1);	// 1
		System.out.println("Value for e1 : " + e1);	// 5
		System.out.println("Value for f1 : " + f1);	// 3
		
		System.out.println("Assignment Operater !");

		int a2 = 10;
		System.out.println("Value for a2 : " + a2);	// 10
		a2 += 10;
		System.out.println("Value for a2 : " + a2);     // 20
		a2 -= 10;
		System.out.println("Value for a2 : " + a2);	// 10
		a2 *= 10;
		System.out.println("Value for a2 : " + a2);	// 100
		a2 /= 10;
		System.out.println("Value for a2 : " + a2);	// 10
		a2 %= 2;
		System.out.println("Value for a2 : " + a2);	// 0

		System.out.println("Relatation Operater !");
		
		int a3 = 10;
		int b3 = 20;
		
		System.out.println("Condation check : " + (a3 == b3));	// False
		System.out.println("Condation check : " + (a3 != b3));	// True
		System.out.println("Condation check : " + (a3 >= b3));	// False
		System.out.println("Condation check : " + (a3 <= b3));  // True
		System.out.println("Condation check : " + (a3 > b3));	// False
		System.out.println("Condation check : " + (a3 < b3));  // True
		
		System.out.println("Logical Operater !");
		System.out.println("!true =" + !true);
	//	System.out.println(5 / 0 == 0);
	//	System.out.println(false & (5 / 0 == 0));
		System.out.println(false && (5 / 0 == 0));
	//	System.out.println(false | (5 / 0 == 0));
	//	System.out.println(false || (5 / 0 == 0));
	//	System.out.println((10 % 2) && (5 / 0 == 0));
		
		System.out.println("~1 = " + ~4);
	}
}