class Operator{
	public static void main(String[] args){

		System.out.println("======Unary Arithamatic Operators======"); 
		int a = +10;
		int b = -10;
		int c = ++a;
		int d = a++;
		int e = --a;
		int f = a--;

		System.out.println(a);   	//10
		System.out.println(b);		//-10
		System.out.println(c);		//11
		System.out.println(d);		//11
		System.out.println(e);		//11
		System.out.println(f);		//11
		System.out.println(a);		//10
		
		System.out.println("===== Logical Operators =====");
		
//		System.out.println(false & (5 / 0 == 0) ); 	// Runtime Exception
		System.out.println(false && (5 / 0 == 0) );	// false
//		System.out.println(true | (5 / 0 == 0) );	// Runtime Exception
		System.out.println(true || (5 / 0 == 0) );	// true
		System.out.println("!true = " + !true);		// false
		System.out.println(true ^ true); 			// false
		System.out.println(true ^ false);			// true
		System.out.println(false ^ true);			// true
		
		System.out.println();

		System.out.println("~1 = " + ~1);
		System.out.println(Integer.toBinaryString(1));		// 00000001
		System.out.println(Integer.toBinaryString(-2));		// 11111110
		System.out.println((byte)0b11111110);				// -2
		System.out.println((byte)0b10000000);				// -128 = -(2 ^ 7)
		System.out.println((byte)0b11000000);				// -64 = -(2 ^ 7) + (2 ^ 6) 
		
		
		System.out.println("5 = " + 0b101);
		System.out.println("5 >> 1 = " + (0b101 >> 1));
		System.out.println("5 in binary format = " + Integer.toBinaryString(5));
		System.out.println("2 in binary format = " + Integer.toBinaryString(2));	// 10
		
		
		System.out.println("5 = " + 0b101);					// 000000101
		System.out.println("5 >>> 1 = " + (0b101 >>> 1));	// 000000010
		
		int negativeByteValue = 0b11111111111111111111111110000000;
		System.out.println("-128 = " + negativeByteValue);					// 11111111111111111111111110000000
		System.out.println("-128 >>> 1 = " + (negativeByteValue >>> 1));	// 01111111111111111111111111000000
		System.out.println("-128 >> 1 = " + (negativeByteValue >> 1));		// 11111111111111111111111111000000
		
		
		System.out.println("5 = " + 0b101);
		System.out.println("5 << 1 = " + (0b101 << 1));
		System.out.println("5 in binary format = " + Integer.toBinaryString(5));
		System.out.println("10 in binary format = " + Integer.toBinaryString(10));
		
		System.out.println("10 * 2 = 10 << 1 = " + (10 << 1));	// x << y = x * (2 ^ y) 
		System.out.println("10 / 2 = 10 >> 1 = " + (10 >> 1));	// x >> y = x / (2 ^ y)
		
		System.out.println();
		
		// ============ Ternary Operator
		
//		(condition) ? true expression : false expression
		
		System.out.println("===== Ternary Operator =====");
		
		System.out.println(2 > 1 ? "2 is greater than one" : "2 is not less than one");
		System.out.println(2 < 1 ? "2 is greater than one" : "2 is not less than one");

	}
}