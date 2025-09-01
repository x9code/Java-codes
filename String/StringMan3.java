class StringMan3{
	public static String test(String s){
		String res = null;
		char[] c = s.toCharArray();
		// c[0]=' ';
		// c[c.length-1]=' ';
		char[] c1 = new char[c.length-2];
		for(int i = 0 ; i<= c1.length-1;i++){
			c1[i]=c[i+1];
		}
		res = String.valueOf(c1);
		return res;
	}
	public static void main(String[] args) {
		String s = "java";
		System.out.println(test(s));
	}
}
