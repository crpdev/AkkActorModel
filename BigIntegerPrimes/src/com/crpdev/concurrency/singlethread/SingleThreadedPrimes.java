package com.crpdev.concurrency.singlethread;

import java.math.BigInteger;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SingleThreadedPrimes {

	public static void main(String[] args) {

		System.out.println("Hello!");

		SortedSet<BigInteger> primes = new TreeSet<BigInteger>();

		Long startTime = System.currentTimeMillis();

		while (primes.size() < 20) {
			BigInteger bigInt = new BigInteger(2000, new Random());
			BigInteger newPrime = bigInt.nextProbablePrime();
			System.out.println(newPrime);
			primes.add(newPrime);
		}

		Long endTime = System.currentTimeMillis();
		System.out.println("Time Taken: " + (endTime - startTime) + " ms.");

		System.out.println(primes);

	}

}
