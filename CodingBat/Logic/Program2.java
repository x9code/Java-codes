//SquirrelPlay
class Program2{
	public static boolean test(int temp, boolean isSummer){
		boolean result = false;
		//logic
		if(temp >=60 && temp <=90 && !isSummer){
			return true;
		}else if(temp >=60 && temp <=100 && isSummer){
			return true;
		}

		return result;
	}
	public static void main(String[] args) {
		System.out.println("Program Starts....");
		boolean result;
		result = test(70,false);
		System.out.println(result);

		result = test(95,false);
		System.out.println(result);

		result = test(95,true);
		System.out.println(result);





		System.out.println("Program Ends......");
	}
}