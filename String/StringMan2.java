class StringMan2{
	public static String test(String str){
		String res = null;
		char[] c = str.toCharArray();
		int mid = (c.length-1)/2;
		int last = c.length-1;
		if(c[0]!=c[mid]){
			c[0]='x';
		}
		if(c[last]==c[mid]){
			char temp = c[mid];
			c[mid] = c[last];
			c[last] = temp;
		}
		res = String.valueOf(c);
		return res;
	}
	public static void main(String[] args) {
		String s = "dxyz";
		System.out.println(test(s));
	}
}