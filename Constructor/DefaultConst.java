class Main{
	// Main(){

	// }
	Main(){
		System.out.println("Hello i am 0 argument constructor");
	}
	Main(int a){
		System.out.println("hello "+ a);
	}
}
class DefaultConst{
	public static void main(String[] args) {
		Main m1 = new Main();
	}
}