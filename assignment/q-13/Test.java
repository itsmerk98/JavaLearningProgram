class Test {
   public static void main(String[] args){
	Sample s = new Sample();
	System.out.println(s.num);
	
//	System.out.println(s.display());
   }	
}
class Sample {
	final int num = 80;
	void display(){
		num = 23;
		System.out.println("Final number is : " + num );
	}
}
