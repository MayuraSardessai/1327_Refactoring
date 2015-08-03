package PrimeNumber;

public class PrimeNumberGenerator {
	
	boolean[] f;
	int s, count;
	int[] primes;
	PrimeNumberCounter counter;
	PrimeNumberDisplay display;
	PrimeNumberInitiation init;
	SieveAlgorithm sieve;
	
	PrimeNumberGenerator(int maxValue)
	{
		s=maxValue+1;
		f= new boolean[s];
		counter = new PrimeNumberCounter();
		display = new PrimeNumberDisplay();
		init = new PrimeNumberInitiation();
		sieve = new SieveAlgorithm();
		
	}
	void generator()
	{
		f = init.intialise(f);
		f= init.getRid(f);
		f=sieve.applyAlgo(f,s);
		count = counter.countPrimes(f,s);
		primes = sieve.copyPrimes(f,s,count);
		display.displayPrimes(primes);
		
		
	}
}
