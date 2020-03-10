package com.crpdev.concurrency.multithread;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadedPrimes {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello");

		Result primes = new Result();

		Runnable generatorTask = new PrimeGenerator(primes);
		Runnable statusTask = new CurrentStatus(primes);
		Thread statusThread = new Thread(statusTask);
		statusThread.start();

		List<Thread> threads = new ArrayList<>();

		Long startTime = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			Thread t = new Thread(generatorTask);
			threads.add(t);
			t.start();

		}

		for (Thread thread : threads) {
			thread.join();
		}

		Long endTime = System.currentTimeMillis();

		System.out.println("Time Taken: " + (endTime - startTime) + " ms.");

	}

}
