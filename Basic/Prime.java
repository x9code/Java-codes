import java.util.Scanner;
class Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean b = false;
		if(a <= 1){
			b=false;
		}
		for(int i = 2 ; i <= Math.sqrt(a) ;i++){
			if(a%i==0){
				b = false;
			}
		}
		if(b){
			System.out.println(a+" is not a Prime Number");
		}else{
			System.out.println(a+" is a Prime Number");
		}
	}
}