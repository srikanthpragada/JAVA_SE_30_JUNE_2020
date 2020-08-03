package coll;

import java.util.TreeSet;

class Time implements Comparable<Time> {
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

	@Override
	public int hashCode() {
		return this.h;
	}
	
	public int totalSeconds() {
		return this.h * 3600 + this.m * 60 + this.s;
	}

	@Override
	public int compareTo(Time other) {
		return  this.totalSeconds() - other.totalSeconds(); 
	}
}

public class SortTimes {
	public static void main(String[] args) {
		var times = new TreeSet<Time>();
		times.add(new Time(10, 10, 10));
		times.add(new Time(10, 20, 30));
		times.add(new Time(10, 10, 10));
		times.add(new Time(1, 2, 3));
		times.add(new Time(5, 5, 5));

		for (var t : times)
			System.out.println(t);

//		var localTimes = new HashSet<LocalTime>();
//		localTimes.add(LocalTime.of(10, 10, 10));
//		localTimes.add(LocalTime.of(10, 10, 10));
//		localTimes.add(LocalTime.of(1, 2, 3));
//
//		for (var t : localTimes)
//			System.out.println(t);

	}
}
