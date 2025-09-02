class NewString{

	public static void main(String[] args) {
		String s = "Welcome";
		int l = s.length();
		char[] c = s.toCharArray();
		char[] upper = new char[20];
		char[] lower = new char[20]; 
		int uIndex = 0, lIndex = 0;
		for( char n: c){
			for(char i ='A';i<='Z';i++){
				if(n==i){
					upper[uIndex++]=n;
				}
			}
			for(char r ='a';r<='z';r++){
				if(n==r){
					lower[lIndex++] = r;
				}
			}
		}
		System.out.println("upper cases : "+Arrays.toString(upper));
		System.out.println("lower cases : "+Arrays.toString(lower));
	}
}