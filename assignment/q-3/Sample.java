class Sample{
	public static void main(String[] args){
		int f1 = 0, f2 = 1, f3 = 10;
		System.out.println("fibonaccci series till " + f3 + " terms : ");
		while(f1<=f3) {
			System.out.print(f1 + ", ");
			int f4 = f1 + f2;
			f1 = f2;
			f2 = f4;
		}
	}
}