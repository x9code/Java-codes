//Given two non-negative integers, return the larger one. 
//If they have the same remainder when divided by 5, return the smaller one. If they are the same, return 0.
class mod5{
	public static int test(int a, int b){
		if(a==b)
			return 0;
		if(a%5==b%5){
			return Math.min(a,b);
		}
		return Math.max(a,b);
	}
	public static void main(String[] args) {
		System.out.println(test(3,4));
		System.out.println(test(5,35));
		System.out.println(test(35,75));
	}
}