package PrimeNumber;

public class PrimeNumberCounter {

	public int countPrimes(boolean[] f, int s) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i=0; i<s;i++){
			if (f[i])
				count++;
		}
		return count;
	}

}
