class Demo{
	int a1= 100;
	public void test(){
		System.out.println("test() of demo");
	}
}
class Sample extends Demo{
	double z1 = 34.5;
	public void count(){
		System.out.println("count() of sample class");
	}
}






class SingleIneritance{
	public static void main(String[] args) {
		System.out.println("Program Starts.....");
		Demo d1 = new Demo();
		System.out.println(d1.a1);
		d1.test();
		Sample  s1 = new Sample();
		System.out.println(s1.z1);
		System.out.println(s1.a1);
		s1.count();
		s1.test();

		System.out.println("Program ends.....");
	}
}