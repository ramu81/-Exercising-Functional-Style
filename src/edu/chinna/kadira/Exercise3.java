package edu.chinna.kadira;

import java.util.Arrays;
import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		List<TimeSlot> timeSlots = createTimeSlots();
		
//Imperative style
		String bookingDetails = null;

		for (TimeSlot timeSlot : timeSlots) {
			if (timeSlot.isAvailable()) {
				bookingDetails = timeSlot.schedule();
				break;
			}
		}

		if (bookingDetails != null) {
			System.out.println(bookingDetails);
		} else {
			System.out.println("Not Available");
		}
		
//Functional style
		System.out.println(timeSlots.stream()
			.filter(TimeSlot::isAvailable)
			.findFirst()
			.map(TimeSlot::schedule)
			.orElse("Not Available"));

	}

	/**
	 * 
	 * @return
	 */
	protected static List<TimeSlot> createTimeSlots() {
		return Arrays.asList(new TimeSlot(), new TimeSlot(), new TimeSlot(), new TimeSlot(), new TimeSlot());
	}
}
