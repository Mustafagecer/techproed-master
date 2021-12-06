package day25interfaceencapsulation;

public interface  Vehicle {
	public default void move () {
		System.out.println("All vehicles shuld move...");
	}

	public default void staticMove () {
		System.out.println("All vehicles shuld move better...");
	}

}
