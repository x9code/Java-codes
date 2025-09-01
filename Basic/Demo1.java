class Demo1{
	public static void main(String[] args){
		System.out.println("start");
		int marks = 96;
		if(marks >= 80 && marks <=100){
			System.out.println("Grade A");
		}else if(marks>=60 && marks <=79){
			System.out.println("Grade B");
		}else if(marks >=35 && marks <=59){
			System.out.println("Grade c");
		}else{
			System.out.print("fail");
		}
	}
}