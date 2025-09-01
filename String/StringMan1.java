class StringMan1{
	public static void test(String str){
		char[] c = str.toCharArray();
		c[0]='a';
		c[c.length-1]='a';
		System.out.println(c);
	}
	public static void main(String[] args) {
		String s = "javaclass";
		test(s);
	}
}