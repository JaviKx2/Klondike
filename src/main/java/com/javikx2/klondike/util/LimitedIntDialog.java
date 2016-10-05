package com.javikx2.klondike.util;


public class LimitedIntDialog {

	private String title;
	
	private ClosedInterval limits;
	
	public LimitedIntDialog(String title, int min, int max){
		assert title != null;
		this.limits = new ClosedInterval(min, max);
		this.title = title + " " + limits + ": ";
	}
	
	public LimitedIntDialog(String title, int max){
		this(title, 1, max);
	}
	
	public int read(){
		ConsoleIO io = new ConsoleIO();
		int value;
		boolean ok;
		do {
			value = io.readInt(title);
			ok = limits.includes(value);
			if (!ok) {
				io.writeln("The value must be between " + limits);
			}
		} while (!ok);
		return value;
	}
}
