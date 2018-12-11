
public class PrimeNumber {

	public static boolean isPrime(int number) {
		int countForPrimes = 0;
		for(int i=2;i<=number/2;i++){
			if(number%i == 0)
			countForPrimes++;
		}
		if(countForPrimes == 0)
			return true;
		else
			return false;
	}
	

}
