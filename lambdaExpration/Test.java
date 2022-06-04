class Test {
	public static void main(String[] args) {
		// 1. Polymorphic statement
//		Cab cab = new UberX(); 
//		cab.bookCab();
		

		// 2. Anonymous class Implementation.	
/*		Cab cab = new Cab() {
			public void bookCab() {
				System.out.println("UberX Booked !! Arriving soon @@ " );
			}
		};
		cab.bookCab();		
*/
//		3. using lambda expression.
		Cab cab = ()-> {
			System.out.println("UberX booked !! Arriving soon @@ " );
		};
		cab.bookCab();
	}
}
interface Cab {
	void bookCab();
}
/*class UberX implements Cab { 
	public void bookCab() {
		System.out.println("UberX Booked !! Arriving soon @@ " );
	}
}*/