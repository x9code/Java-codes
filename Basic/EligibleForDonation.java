import java.util.Scanner;
class EligibleForDonation{
	public static void main(String[] args) {
		System.out.println("Enter your weight:");
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextInt();
		if(weight >= 50){
			System.out.println("you'r Eligible For Donation");
		}else{
			System.out.println("not eligible");
		}
	}
}