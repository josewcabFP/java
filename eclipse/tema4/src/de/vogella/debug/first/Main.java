package de.vogella.debug.first;

public class Main {

	public static void main(String[] args) {
		
		
		Counter counter = new Counter();
		
		counter.count();
		
		System.out.println("We've counted : " + counter.getResult());

	}

}
