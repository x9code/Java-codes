//CigarParty
class Program1{
	public static boolean test(int cigar, boolean isWeekend){
		boolean result=true;
		if(cigar<40){
			result = false;
		}else if(cigar>60 && !isWeekend){
			return false;
		}
		return result;
	}
	public static void main(String[] args) {
		 boolean result=test(30,false);
		 System.out.println(result);
		 result=test(50,false);
		 System.out.println(result);
		 result=test(70,true);
		 System.out.println(result);
	}
}