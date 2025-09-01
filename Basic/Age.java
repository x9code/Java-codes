class Age{
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = 6;
		int small = a;
		if(a>b){
			small = b;
		}else if(b>c){
			small = c;
		}else{
			small = a;
		}
		System.out.println(small);
	}
}