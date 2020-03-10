package com.crpdev.concurrency.multithread;

import java.math.BigInteger;
import java.util.Random;

public class PrimeGenerator implements Runnable {

	private Result primes;

	public PrimeGenerator(Result primes) {
		this.primes = primes;
	}

	@Override
	public void run() {
		BigInteger bigInt = new BigInteger(2000, new Random());
		BigInteger nextProbablePrime = bigInt.nextProbablePrime();
//		System.out.println("Newly Generated Prime: " + nextProbablePrime);
		primes.addPrime(nextProbablePrime);
	}

}
