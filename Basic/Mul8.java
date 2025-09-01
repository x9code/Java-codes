class Mul8{
	public static void test(int n){
		if(n%8==0){
			System.out.println(n +" is multiple of 8");
		}else{
			System.out.println(n +" is not multiple of 8");
		}

	}
	public static void main(String[] args) {
		int a = 16;
		test(a);
		
	}
}