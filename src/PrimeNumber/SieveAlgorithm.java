package PrimeNumber;

public class SieveAlgorithm {
	int primes[];
	SieveAlgorithm()
	{
		
	}
	public boolean[] applyAlgo(boolean[] f, int s) {
		// TODO Auto-generated method stub
		
		for (int i =2; i<=Math.sqrt(s)+1;i++){
			if (f[i]){//cross its multiples
				for (int j=2*i; j<s; j+=i){
					f[j]=false;
				}
			}
		}	
		return f;
	}

	public int[] copyPrimes(boolean[] f, int s, int count) {
		// TODO Auto-generated method stub

		primes = new int[count];
		for (int k=0,l=0; l<s; l++ ){
			if (f[l])
				primes[k++]=l;
		}
		return primes;
	}

}
