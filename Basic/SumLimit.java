// 3. Sum Limit
// Given two non-negative ints a and b, return their sum. But if the sum has more digits than a, return a instead.
// Example:
// sumLimit(2, 3) → 5
// sumLimit(8, 3) → 8 (since 8+3=11 has more digits than 8)
class SumLimit{
	public static int test(int a, int b){
		int sum = a+b;
		int len = String.valueOf(sum).length();
		int lenA = String.valueOf(a).length();
		if(len > lenA){
			return a;
		}
		return sum;
	}
	public static void main(String[] args) {
	System.out.println(test(3,4));
	System.out.println(test(8,7));
	}
}