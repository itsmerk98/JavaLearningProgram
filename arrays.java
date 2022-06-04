class arrays {
	public static void main(String []args){
		int[] arr1 = {10,20,30};
		System.out.println("Array size is : " + arr1.length);
		for(int i = 0; i < arr1.length; i++){
			System.out.println("Possition of array value is : " + arr1[i]);
		}
		int i = 0;
		while(i < arr1.length){
			System.out.println("Array value is : " + arr1[i]);
			i = i + 1;
		}
	}
}