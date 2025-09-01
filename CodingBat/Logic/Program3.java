class Program3{
	public static boolean test(int num){
		boolean result = ;
		//logic
		 if(num%20==1 || num%20==2){
         return true;
         }else{
         return false;
         }

		return result;
	}
	public static void main(String[] args) {
		System.out.println("starts...");
		boolean result = test(20);
		System.out.println(result);
		boolean result = test(21);
		System.out.println(result);
		boolean result = test(22);
		System.out.println(result);



		System.out.println("ends.....");
	}
}