class Demo{
	int z = 45;
	public void count(){
		System.out.println("count() of demo class");
	}
}
class Sample extends Demo{
	double k1 = 3.4;
	public void view(){
		System.out.println("view() of sample class");
	}
}
class ReferenceReturn{
	public static  Demo getObject(String classname){
		if(classname.equals("Demo")){
			return new Demo();
		}else{
			return new Sample();
		}
	}
	public static void main(String[] args) {
		//Demo ref1 = new Demo();
		Demo ref1 = null;
		ref1 = getObject("Sample");
		System.out.println(ref1);
		ref1.count();
	}
}