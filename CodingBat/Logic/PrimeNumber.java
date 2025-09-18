class PrimeNumber{
	static boolean isPrime(int number)
    {
        for (int i = 2; i <= number/2; i++)
        {
            if(number% i == 0)
            {
                // Not Prime
                return false;
            }
        }

        // Just Prime!
        return true;
    }
   
	public static void main(String[] args) {
		System.out.println( "is prime: "+isPrime(6));
	}
}