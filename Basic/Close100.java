//Write a method that takes two integers a and b and returns whichever is closer to 100. If they are equal distance, return 0.
class Close100{
	public static int text(int a, int b){
    int dif1 = Math.abs(100-a);
    int dif2 = Math.abs(100-b);
    int s = 0;
    if(dif1==dif2)
    	return 0;
    if(dif1 < dif2)
    		return a;
    	else
    		return b;
	}
	public static void main(String[] args) {
		System.out.println(text(223,187));
	}
}