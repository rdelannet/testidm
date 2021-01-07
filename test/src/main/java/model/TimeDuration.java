package model;

import java.util.concurrent.TimeUnit;

import exception.BadBadValueException;

public class TimeDuration {
	private int second;
	
	public TimeDuration(int second) {
		try {
			if(second < 0) {
				throw new IllegalArgumentException();
			}
			else {
				this.second = second;
			}
			
		}
		catch(IllegalArgumentException e) {
			 throw new BadBadValueException("second can be negative");
		}
	}
	


	@Override
	public String toString() {
		return TimeUnit.SECONDS.toHours(second)+"h "
				+ (TimeUnit.SECONDS.toMinutes(second) - (TimeUnit.SECONDS.toHours(second)* 60))+"min "
				+(TimeUnit.SECONDS.toSeconds(second) - (TimeUnit.SECONDS.toMinutes(second) *60))+"s";
	}

}
