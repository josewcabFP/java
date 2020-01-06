package de.vogella.debug.first;

public class Counter {
	
	// Attributes
	
	private int result = 0;
	
	// Methods
	
	public int getResult() {
		return this.result;
	}
	
	public void count() {
		for (int i = 0; i < 100; i++) {
			this.result += i + 1;
		}
	}
	
}

