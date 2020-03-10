package com.crpdev.concurrency.multithread;

public class CurrentStatus implements Runnable {

	private Result primes;

	public CurrentStatus(Result primes) {
		this.primes = primes;
	}

	@Override
	public void run() {

		while (primes.getSize() < 100) {
			System.out.println("Got " + primes.getSize() + " so far.");
			primes.getPrimes().forEach(System.out::println);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
