package coll;

import java.time.LocalTime;
import java.util.HashSet;

class Time {
	private int h, m, s;

	public Time(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Time [h=" + h + ", m=" + m + ", s=" + s + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Time other = (Time) obj;
		return this.h == other.h && this.m == other.m && this.s == other.s;
	}
}

public class SortTimes {
	public static void main(String[] args) {
		var times = new HashSet<Time>();
		times.add(new Time(10, 10, 10));
		times.add(new Time(10, 20, 30));
		times.add(new Time(10, 10, 10));
		times.add(new Time(1, 2, 3));

		for (var t : times)
			System.out.println(t);

		var localTimes = new HashSet<LocalTime>();
		localTimes.add(LocalTime.of(10, 10, 10));
		localTimes.add(LocalTime.of(10, 10, 10));
		localTimes.add(LocalTime.of(1, 2, 3));

		for (var t : localTimes)
			System.out.println(t);

	}
}
