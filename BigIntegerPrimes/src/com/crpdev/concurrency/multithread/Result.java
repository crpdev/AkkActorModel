package com.crpdev.concurrency.multithread;

import java.math.BigInteger;
import java.util.SortedSet;
import java.util.TreeSet;

public class Result {

	private SortedSet<BigInteger> primes;

	public Result() {
		this.primes = new TreeSet<BigInteger>();

	}

	public int getSize() {
		return primes.size();
	}

	public void addPrime(BigInteger prime) {
		synchronized (this) {
			primes.add(prime);
		}
	}

	public SortedSet<BigInteger> getPrimes() {
		synchronized (this) {
			return primes;
		}
	}

}
