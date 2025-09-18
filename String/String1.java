class String1{
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		String s1 = new String("Hello");//non-constant pool
		String s2 = new String("Hello");//non-constant pool
		String s3 = "Hello";//constant pool
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(o1.toString());
		System.out.println(s1.toString());
	}
}