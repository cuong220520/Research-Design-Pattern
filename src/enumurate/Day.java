package enumurate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Day {
	MONDAY("Monday is bad"), TUESDAY("Tuesday is bad"), WEDNESDAY("Wednesday is so-so"), THURSDAY("Thursday is so-so"),
	FRIDAY("Friday is better"), SATURDAY("Saturday is the best"), SUNDAY("Sunday is the best");

	public final String message;
}
