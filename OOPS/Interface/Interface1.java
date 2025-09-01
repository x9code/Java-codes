interface Run{
	int x = 100;
	public void test();
}
interface Sample extends Run{
	public void count();
}
class Demo extends Object implements Sample{
	@Override
	public void test(){
		System.out.println("override test() of Run interface ");
	}
	@Override
	public void count(){
		System.out.println("Override count() of Sample InterFce");
	}
}
class Interface1{
	public static void main(String[] args) {
		System.out.println("starts......");
		System.out.println(Run.x);
		Demo d = new Demo();
		d.test();
		d.count();
		System.out.println("ends........");
	}
}