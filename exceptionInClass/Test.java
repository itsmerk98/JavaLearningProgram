import java.lang.Exception;

class Test {
	public static void main(String[] args){
		int x = 5;
		int y = 1000;
		
		try{
			float z = (float) x /(float)y;
			if(z < 0.01) {
				throw new MyException("number is too small" );
			}
		}
		catch(MyException e) {
			System.out.println("Ravina Exception " );
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I am always here ");
		}
	}
}
class MyException extends Exception {
	MyException(String msg) {
		super(msg);
	}
}
