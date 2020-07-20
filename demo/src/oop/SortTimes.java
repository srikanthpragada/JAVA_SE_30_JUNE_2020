package oop;

import java.util.Arrays;

class Time implements Comparable<Time>{
	private int h, m, s;
	public Time(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	@Override
	public String toString() {
		return "Time [h=" + h + ", m=" + m + ", s=" + s + "]";
	}
	public int getTotalSeconds() {
		return  this.h * 3600 + this.m * 60 + this.s;
	}
	@Override
	public int compareTo(Time other) {
		// System.out.println("compareTo");
		return this.getTotalSeconds() - other.getTotalSeconds();
	}
}

public class SortTimes {

	public static void main(String[] args) {
		Time[] times = { new Time(10, 20, 30), new Time(1, 2, 3),
				         new Time(10, 10, 10), new Time(20, 10, 30) };
		
		System.out.println(times[0].compareTo(times[1]));

		Arrays.sort(times);

		for (Time t : times)
			System.out.println(t);
	}

}
