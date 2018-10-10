package edu.chinna.kadira;

import java.util.Random;

public class TimeSlot {
	/**
	 * 
	 */
	protected static Random random = new Random(System.nanoTime());

	/**
	 * 
	 * @return
	 */
	public String schedule() {
		return "booking details :  " + hashCode();
	}

	/**
	 * 
	 * @return
	 */
	public boolean isAvailable() {
		return random.nextBoolean();
	}

}
